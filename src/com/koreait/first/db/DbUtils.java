package com.koreait.first.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {
	public static void close(Connection con) {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static Connection getCon() { // connection import 해주고 getcon 생성자 만들어줌
		Connection con = null;

		// database를 쓰려면 어디다가 접속을 할지 연결을 해줘야함
		final String URL = "jdbc:mysql://localhost:3306/test"; // db명을 3306 뒤에 적으면 됨
		final String USER = "root";
		final String PW = "koreait2020";

		// forName 메서드 > static메서드 "객체화 안하고 쓰는 메서드"
		// 무조건 사용하는 쪽에서 try을 해줘야함
		try {
			// Class.forName("com.mysql.cj.jdbc.Driver");
			// > getConnection이 자동으로 뭔지 찾아주기 때문에 굳이 Class.forname을 할 필요가 없다
			con = DriverManager.getConnection(URL, USER, PW);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("접속 완료 !");

		return con;
	}
}