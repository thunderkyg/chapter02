package com.javaex.ex04;

public class Song {
	
	String title, artist, album, composer, track;
	int year;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public String getAlbum() {
		return album;
	}
	public String getComposer() {
		return composer;
	}
	public String getTrack() {
		return track;
	}
	public int getYear() {
		return year;
	}
	
	public void ShowInfo() {
		System.out.print(artist + ", " + title + " ( " + album + ", " + year + ", " + track + ", " + composer + " 작곡 )");
		System.out.println();
	}
	
}
