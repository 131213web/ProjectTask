package com.musicshare.dao;

import java.sql.*;
import java.util.*;
import com.musicshare.bean.*;
import com.musicshare.db.*;

public class SongDao {
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
	
	public synchronized ArrayList<Song> findSongByName(String name) {
		ArrayList<Song> songList = new ArrayList<Song>();
		try {
			if(!isConnected())
				getConnect();
			String sql = "select * from song where songName = ?";
			preStmt = conn.prepareStatement(sql);
			preStmt.setString(1, name);
			resultset = preStmt.executeQuery();
			while(resultset.next()){
				Song song = new Song();
				song.setSongId(resultset.getInt(1));
				song.setAlbumId(resultset.getString(2));
				song.setSongName(resultset.getString(3));
				song.setYear(resultset.getInt(4));
				song.setSongUrl(resultset.getString(5));
				song.setSongVote(resultset.getInt(6));
				song.setGnere(resultset.getString(7));
				song.setThemeType(resultset.getString(8));
				song.setRegionName(resultset.getString(9));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		return songList;
	}
	
	public synchronized boolean addSong(Song song) {
		boolean result = false;
		try{
			if(!isConnected())
				getConnect();
			String sql = "insert into song values (?, ?, ?, ?, ?, ?, ?, ?)";
			preStmt = conn.prepareStatement(sql);
			preStmt.setString(1, song.getAlbumId());
			preStmt.setString(2, song.getSongName());
			preStmt.setInt(3, song.getYear());
			preStmt.setString(4, song.getGnere());
			preStmt.setString(5, song.getThemeType());
			preStmt.setString(6, song.getRegionName());
			
			int count = preStmt.executeUpdate();
			if(count >=1)
				result = true;
		}catch(SQLException e){
			e.printStackTrace();
		}catch(Exception e){
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
