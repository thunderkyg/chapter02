package com.javaex.ex07;

public class Song {

	// 필드 (Field)
	
	private String title, artist, album, composer;
	private int year, track;

	// 생산자 (Construct)
	
	public Song() {

	}
	
	public Song (String title, int track) {
		if (track<0) {
			this.track = 0;
		}else {this.track = track;}
		this.title = title;
	}	
	
	public Song(String title, String artist, String album, String composer, int year, int track) {
		
		this(title, track);
		
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;

	}

	
	// 메소드 (Getter/Setter)
	
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
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setTrack(int track) {
		this.track = track;
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

	public int getYear() {
		return year;
	}

	public int getTrack() {
		return track;
	}

	
	// 메소드 (Normal)
	
	public void ShowInfo() {
		System.out.print(artist + ", " + title + " ( " + album + ", " + year + ", " + track + "번 track, " + composer + " 작곡 )");
		System.out.println();
	}
}
