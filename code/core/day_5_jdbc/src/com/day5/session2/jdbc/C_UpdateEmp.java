package com.day5.session2.jdbc;

import java.sql.*;

public class C_UpdateEmp {

	public static void main(String[] args) {

		Connection connection = null;
		try {

			connection = ConnectionFactory.getConnection();

			PreparedStatement pstmt=
					connection
					.prepareStatement("update emp set salary=? where id=?");
			pstmt.setDouble(1, 6900);
			pstmt.setInt(2, 4);
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