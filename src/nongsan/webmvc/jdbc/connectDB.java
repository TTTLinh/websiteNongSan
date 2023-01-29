package nongsan.webmvc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectDB {
	private static final String URL = "jdbc:mysql://localhost:3306/qlns?characterEncoding=UTF8";
	private static final String USER = "root";
	private static final String PASS = "123456789";
	
	public static Connection getConnect(){
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	return DriverManager.getConnection(URL, USER, PASS);
	} catch (SQLException | ClassNotFoundException e) {
	throw new RuntimeException("Error connecting to the database", e);
	}
	}
}