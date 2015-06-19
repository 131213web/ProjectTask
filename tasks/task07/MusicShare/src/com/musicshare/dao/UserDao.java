package com.musicshare.dao;


import com.musicshare.bean.*;
import com.musicshare.db.*;
import java.sql.*;
import java.util.*;

public class UserDao {
	private Connection conn = null;
	private ResultSet resultset = null;
	private PreparedStatement preStmt = null;
	private boolean connectedToDB = false;
	
	private synchronized boolean isConnected() {
		return connectedToDB;
	}
	
	private synchronized void getConnect() {
		conn = UserDBConn.getConnect();
		connectedToDB = true;
	}
	
	
	/*
	 * @author ÕÅ¼ÎÎ°
	 * 
	 */
	public synchronized  User find(String username, String password) {
		User user = null;
		try {
			if(!isConnected())
				getConnect();
			String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
			preStmt = conn.prepareStatement(sql);
			preStmt.setString(1, username);
			preStmt.setString(2, password);
			resultset = preStmt.executeQuery();
			if(resultset.next()) {
				user = new User();
				user.setUserName(resultset.getString(1));
				user.setPassWord(resultset.getString(2));
				user.setEmail(resultset.getString(3));
				user.setTel(resultset.getString(4));
				user.setSex(resultset.getBoolean(5));
				user.setRegistDate(resultset.getDate(6));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public synchronized boolean addUser(User user) {
		boolean result = false;
		try{
			String sql = "insert into user values (?,?,?,?,?,?)";
			preStmt = conn.prepareStatement(sql);
			preStmt.setString(1, user.getPassWord());
			preStmt.setString(2, user.getPassWord());
			preStmt.setString(3, user.getEmail());
			preStmt.setString(4, user.getTel());
			preStmt.setBoolean(5, user.getSex());
			preStmt.setDate(6, (java.sql.Date)user.getRegistDate());
			
			int count = preStmt.executeUpdate();
			if(count >= 1)
				result = true;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception e ) {
			e.printStackTrace();
		}	
		
		return result;
	}
	
	public void finalize() {
		try{
			conn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
}
