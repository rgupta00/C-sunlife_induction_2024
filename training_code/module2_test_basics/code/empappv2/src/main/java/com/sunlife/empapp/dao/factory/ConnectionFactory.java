package com.sunlife.empapp.dao.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	private static Connection connection;

	private ConnectionFactory() {
	}

	public static Connection getConnection() {

		Properties properties = new Properties();
		try {
			InputStream is = 
					ConnectionFactory.class.getClassLoader().getResourceAsStream
			("db.properties");
			
			properties.load(is);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String driver = properties.getProperty("jdbc.driver");
		String url = properties.getProperty("jdbc.url");
		String username = properties.getProperty("jdbc.username");
		String password = properties.getProperty("jdbc.password");

		try {
			Class.forName(driver);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}

}
