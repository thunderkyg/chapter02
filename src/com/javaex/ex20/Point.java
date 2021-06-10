package com.javaex.ex20;

public class Point extends Shape implements Drawable{

	// Field
	private int x;
	private int y;

	// Constructor
	public Point() {

	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	// Method-G/S

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// Method-Ordinary
	
	public void draw() {
		System.out.println(x + ", " + y);
	}
	
}
