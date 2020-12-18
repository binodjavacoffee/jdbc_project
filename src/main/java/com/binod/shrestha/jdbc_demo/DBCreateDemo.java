package com.binod.shrestha.jdbc_demo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCreateDemo {
	public static final String URL = "jdbc:mysql://localhost:3306/";
	public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "root1234";
	public static final String SQL = "create database bino_db";

	public static void main(String[] args) {

		Connection con = null;
		Statement st = null;

		try {
			// step-1 register the driver
			Class.forName(DRIVER_NAME);
			// step-2 get connection object
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			// step-3 get statement object
			st = con.createStatement();
			// step-4 execute the query
			st.executeUpdate(SQL);
			System.out.println("Database Executed......");
		} catch (SQLException | ClassNotFoundException e) {

			e.printStackTrace();
		} finally {
			try {
				// step-5 close the connection
				con.close();
				st.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

}
