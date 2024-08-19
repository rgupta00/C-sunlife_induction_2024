package com.day5.session2.jdbc;

import java.sql.*;

public class B_AddEmployee {

	public static void main(String[] args) {

		Connection connection = null;
		try {

			connection = ConnectionFactory.getConnection();

			PreparedStatement pstmt=
					connection
					.prepareStatement("insert into emp(name, salary) values(?,?)");
			pstmt.setString(1, "umesh");
			pstmt.setDouble(2, 6700);
			int noOfTupleEffected=pstmt.executeUpdate();
			System.out.println(noOfTupleEffected);
			
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