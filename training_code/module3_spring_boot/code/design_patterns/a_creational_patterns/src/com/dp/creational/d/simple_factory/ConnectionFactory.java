package com.dp.creational.d.simple_factory;
//it is not a factory method it is a simple factory 

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//both are not same 
//gof talk about "factory method"

import java.sql.*;
import java.util.Properties;


public class ConnectionFactory {
	private static Connection connection = null;

	public static Connection getConnection() {
		try {
			Properties prop = new Properties();
			
//			InputStream inputStream = ConnectionFactory
//					.class.getClassLoader().getResourceAsStream("db.properties");

			FileInputStream in = new FileInputStream("db-mysql.properties");
			
					
			prop.load(in);
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String user = prop.getProperty("user");
			String password = prop.getProperty("password");
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

}
