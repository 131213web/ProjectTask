package com.musicshare.bean;
import java.util.Date;

public class Album {

	String albumId;
	String albumName;
	String albumImage;
	Date albumTime;

	public String getAlbumId() {
		return albumId;
	}
	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public String getAlbumImage() {
		return albumImage;
	}
	public void setAlbumImage(String albumImage) {
		this.albumImage = albumImage;
	}
	public Date getAlbumTime() {
		return albumTime;
	}
	public void setAlbumTime(Date albumTime) {
		this.albumTime = albumTime;
	}



}
