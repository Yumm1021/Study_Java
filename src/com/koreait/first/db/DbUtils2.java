package com.koreait.first.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils2 {
	public static void close(Connection con) {
		if (con!= null) {
			try {
				con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static Connection getCon() {
		Connection con = null;
		
		final String URL = "jdbc:mysql://localhost:3306/test";
		final String USER = "root";
		final String PW = "koreait2020";
		
		try {
			con = DriverManager.getConnection(URL, USER, PW);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("접속완료");
		
		return con;
	}
}
