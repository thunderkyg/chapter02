package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {
		
		Song s01 = new Song("좋은날", "아이유", "Real", "이민수", 2010,	3);
		Song s02 = new Song("거짓말", "BIGBANG", "Always", "G-DRAGON", 2007, 2);
		Song s03 = new Song("벚꽃엔딩", "버스커버스커", "버스커버스커1집", "장범준", 2012, 4);
		
		s01.ShowInfo();
		s02.ShowInfo();
		s03.ShowInfo();
		
		s01.setYear(2011);
		s01.ShowInfo();

		Song s04 = new Song("좋은날", -5);
		s04.ShowInfo();
	}

}
