package com.day5.session2.jdbc;

import java.sql.*;

public class D_DeleteEmp {

	public static void main(String[] args) {

		Connection connection = null;
		try {

			connection = ConnectionFactory.getConnection();

			PreparedStatement pstmt=
					connection
					.prepareStatement("delete from emp where id=?");
			pstmt.setInt(1, 4);
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