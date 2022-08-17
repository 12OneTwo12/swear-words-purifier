package dev.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class WordsPurifierUtils {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/";
	private static final String DATABASE_NAME = "swear_words_purifier";
	private static final String USER = "root";
	private static final String PASSWORD = "1234";

	// Java�� MySQL Database ���� �޼���
	public static Connection getConnection() throws SQLException {
//		Class.forName(DRIVER_NAME); // Driver �ε�, JDBC 4.0  ���ķ� ��� ����̹����� Ŭ�����н����� �ڵ����� �ε���
		return DriverManager.getConnection(DB_URL + DATABASE_NAME, USER, PASSWORD);
	}

}
