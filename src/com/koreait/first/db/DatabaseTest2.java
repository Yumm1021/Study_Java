package com.koreait.first.db;

import java.sql.Connection;

public class DatabaseTest2 {

	public static void main(String[] args) {
		
		Connection con = DbUtils2.getCon();
		
		DbUtils2.close(con);

	}

}
