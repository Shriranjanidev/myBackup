package com.hocoo.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/hocoo";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "root";
	
	private static Connection con;
	
	public static Connection getConnection() {
		try {
			Class.forName(DRIVER_CLASS);
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
