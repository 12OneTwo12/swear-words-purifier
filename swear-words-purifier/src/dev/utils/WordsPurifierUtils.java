package dev.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class WordsPurifierUtils {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/";
	private static final String DATABASE_NAME = "swear_words_purifier";
	private static final String USER = "root";
	private static final String PASSWORD = "1234";

	// Java와 MySQL Database 연결 메서드
	public static Connection getConnection() throws SQLException {
//		Class.forName(DRIVER_NAME); // Driver 로딩, JDBC 4.0  이후로 모든 드라이버들은 클래스패스에서 자동으로 로딩됨
		return DriverManager.getConnection(DB_URL + DATABASE_NAME, USER, PASSWORD);
	}

}
