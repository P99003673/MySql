package com.ltts.configuration;

	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class MyConnection {
		public static Connection getConnection() throws SQLException
		{
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","root");
			
			return c;
			
		}

	}