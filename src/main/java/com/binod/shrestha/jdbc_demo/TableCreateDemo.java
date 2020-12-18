package com.binod.shrestha.jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreateDemo {

	public static final String URL = "jdbc:mysql://localhost:3306/bino_db";
	public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "root1234";
	public static final String SQL = "create table bino_tbl(id int not null auto_increment, user_name varchar(50), primary key(id))";

	public static void main(String[] args) {
		try (
				Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
				Statement st = con.createStatement();) {
			st.executeUpdate(SQL);
			System.out.println("Table Created.");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}