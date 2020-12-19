package com.binod.shrestha.jdbc_demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.binod.shrestha.jdbc_demo.util.DbUtil;

public class DeleteDemo {
	public static final String SQL = "delete from bino_tbl where   id=6";

	public static void main(String[] args) {
		try (
				Connection con = DbUtil.getConnection();
				Statement st = con.createStatement();) {
			st.executeUpdate(SQL);
			System.out.println("Data Deleted.");
		} catch (SQLException e) {

			e.printStackTrace();
		}


	}

}
