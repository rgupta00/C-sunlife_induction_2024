package com.day5.session2.jdbc;

import java.sql.*;

public class A_HelloWorldConnectionFactory {

	public static void main(String[] args) {

		Connection connection = null;
		try {

			connection = ConnectionFactory.getConnection();

			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + ": " +
						rs.getString(2) + ": " + rs.getDouble(3));
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}