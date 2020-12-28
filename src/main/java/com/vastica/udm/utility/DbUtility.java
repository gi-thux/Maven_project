package com.vastica.udm.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtility {
	
	public static final String URL="jdbc:mysql://localhost:3306/demo_db";
	public static final String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
	public static final String USER_NAME="root";
	public static final String PASSWORD="root";
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName(DRIVER_NAME);
	return	DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		
		
	}
}
