package com.binod.shrestha.jdbc_demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.binod.shrestha.jdbc_demo.util.DbUtil;

public class SelectDemo {
	public static final String SQL = "select * from bino_tbl";

	public static void main(String[] args) {
		try (
				Connection con = DbUtil.getConnection();
				Statement st = con.createStatement();) {
//			st.executeUpdate(SQL);(in select instead of executeUpdate we need to use executeQuery to get data from sql)
			ResultSet rs=st.executeQuery(SQL);
			while(rs.next()) {
				System.out.println(rs.getString("user_name"));
			}
			//System.out.println("Data updated.");
		} catch (SQLException e) {

			e.printStackTrace();
		}


	}
}

