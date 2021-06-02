package com.javaex.ex04;

public class SongApp {

	public static void main(String[] args) {
		
		Song iu = new Song();
		Song bigbang = new Song();
		Song busker = new Song();
		
		iu.title = "좋은날";	
		iu.artist = "아이유";	
		iu.album = "Real";	
		iu.composer = "이민수";	
		iu.year = 2010;	
		iu.track = "3번 track";	

		bigbang.title = "거짓말";	
		bigbang.artist = "BIGBANG";	
		bigbang.album = "Always";	
		bigbang.composer = "이민수";	
		bigbang.year = 2007;	
		bigbang.track = "2번 track";
		
		busker.title = "벚꽃엔딩";	
		busker.artist = "버스커버스커";	
		busker.album = "버스커버스커1집";	
		busker.composer = "장범준";	
		busker.year = 2012;	
		busker.track = "4번 track";
		
		iu.ShowInfo();
		bigbang.ShowInfo();
		busker.ShowInfo();
	}

}
