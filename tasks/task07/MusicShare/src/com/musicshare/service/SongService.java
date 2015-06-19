package com.musicshare.service;

import java.util.List;

import com.musicshare.bean.Song;
import com.musicshare.dao.SongDao;
import com.musicshare.exception.MsgException;

public class SongService {

	private SongDao songDao = new SongDao();
	
	public void addSong(Song song) {
		if (!songDao.addSong(song)) {
			throw new MsgException("添加失败");
		}
	}
	
	public List<Song> findSong(String name) {
		List<Song> songs = songDao.findSongByName(name);
		if (songs == null || songs.isEmpty()) {
			throw new MsgException("没有搜索结果");
		}
		return songs;
	}
}
