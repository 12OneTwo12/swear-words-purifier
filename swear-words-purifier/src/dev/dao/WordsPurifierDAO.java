package dev.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dev.model.Word;
import dev.utils.WordsPurifierUtils;

public class WordsPurifierDAO {

	private PreparedStatement preparedStatement;

	public Word transBadWords(String text) {

		final String selectQuery = "SELECT * FROM badwords WHERE badword = ?";

		try (Connection connection = WordsPurifierUtils.getConnection();
				PreparedStatement preparedStatement = createPreparedStatement(connection, selectQuery, text);
				ResultSet resultSet = preparedStatement.executeQuery();) {

			Word word = new Word(resultSet.getInt("bad_word_id"), resultSet.getString("bad_word"),
					resultSet.getString("kind_word"));

			return word;
		} catch (Exception e) {

		}
		return null;
	}

	PreparedStatement createPreparedStatement(Connection connection, String selectQuery, String text)
			throws SQLException {
		preparedStatement = connection.prepareStatement(selectQuery);
		preparedStatement.setString(1, text);

		return preparedStatement;
	}

	public List<Word> findAll() {

		final String selectQuery = "SELECT * FROM bad_words";
		List<Word> Words = new ArrayList<>();

		try (Connection connection = WordsPurifierUtils.getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(selectQuery);) {

			while (resultSet.next()) {
				Word todo = new Word(resultSet.getInt("bad_word_id"), resultSet.getString("bad_word"),
						resultSet.getString("kind_word"));
				Words.add(todo);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return Words;
	}

}
