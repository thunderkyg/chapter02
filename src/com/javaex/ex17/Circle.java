package com.javaex.ex17;

public class Circle extends Shape{
	
	//Fields
	private int radius;

	
	//Constructor
	public Circle() {
		
	}
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}

	
	//Method - G/S
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	//Method - Ordinary
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	public void draw() {
		System.out.println("[면색: " + fillColor + ", 선색: " + lineColor + ", 지름: " + radius + "] 원을 그렸습니다.");
	}

}
