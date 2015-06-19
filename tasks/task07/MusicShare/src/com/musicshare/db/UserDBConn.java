package com.musicshare.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class UserDBConn {
	private static Connection conn = null;
	public static Connection getConnect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String user = "user";
			String pwd = "123456";
			String url = "jdbc:mysql://localhost:3306/musicbar";
			conn = DriverManager.getConnection(url, user, pwd);
		}catch(ClassNotFoundException e) {
			System.out.println("can not found jdbc driver");
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return  conn;
	}
}


