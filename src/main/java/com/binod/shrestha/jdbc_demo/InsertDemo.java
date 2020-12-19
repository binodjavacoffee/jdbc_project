package com.binod.shrestha.jdbc_demo;

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;

import com.binod.shrestha.jdbc_demo.util.DbUtil;

public class InsertDemo {


		
		public static final String SQL = "insert into bino_tbl(user_name)values('bino5')";

		public static void main(String[] args) {
			try (
					Connection con = DbUtil.getConnection();
					Statement st = con.createStatement();) {
				st.executeUpdate(SQL);
				System.out.println("Data Inserted.");
			} catch (SQLException e) {

				e.printStackTrace();
			}


	}

}
