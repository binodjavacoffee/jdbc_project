package com.binod.shrestha.jdbc_demo;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.binod.shrestha.jdbc_demo.util.DbUtil;

public class TableCreateDemo {

		public static final String SQL = "create table bino_tbl(id int not null auto_increment, user_name varchar(50), primary key(id))";

	public static void main(String[] args) {
		try (
				Connection con = DbUtil.getConnection();
				Statement st = con.createStatement();) {
			st.executeUpdate(SQL);
			System.out.println("Table Created.");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}