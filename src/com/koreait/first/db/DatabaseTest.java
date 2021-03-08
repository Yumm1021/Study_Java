package com.koreait.first.db;

import java.sql.Connection;

public class DatabaseTest {

	public static void main(String[] args) {

		// static이 없기 때문에 바로 DbUtils.getCon()해서 호출할 수 있음
		Connection con = DbUtils.getCon();

		DbUtils.close(con);

		// 만약 static이 있으면 **객체화** 해서 호출 해야함
		/*
		 * DbUtils db = new DbUtils();
		 * db.getCon();
		 */
	}

}