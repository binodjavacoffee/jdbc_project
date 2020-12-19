package com.binod.shrestha.jdbc_demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.binod.shrestha.jdbc_demo.util.DbUtil;

public class UpdateDemo {
	public static final String SQL = "update bino_tbl set user_name='bino6' where id=6";

	public static void main(String[] args) {
		try (
				Connection con = DbUtil.getConnection();
				Statement st = con.createStatement();) {
			st.executeUpdate(SQL);
			System.out.println("Data updated.");
		} catch (SQLException e) {

			e.printStackTrace();
		}


	}
}