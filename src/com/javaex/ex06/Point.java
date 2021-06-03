package com.javaex.ex06;

public class Point {

	
//	필드
	private int x;
	private int y;
	
//	생성자
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(int x) {
		this.x = x;
	}
	
//	메소드-게터세터
	public void setX(int a) {
		x = a;
	}

	public void setY(int b) {
		y = b;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
//	메소드-일반
	
	public void draw() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}

}
