package com.javaex.ex16;

public class Circle extends Rectangle {
	
	
	//Field
	private String fillColor;
	private String lineColor;
	private int radius;
	public String getFillColor() {
		return fillColor;
	}
	
	//Constructor

	public Circle() {
		
	}
	
	public Circle(String fillColor, String lineColor, int radius) {
		super();
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.radius = radius;
	}
	
	//Method - G/s
	
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	//Method - Ordinary
	@Override
	public String toString() {
		return "Circle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", radius=" + radius + "]";
	}
	
	public void draw() {
		System.out.println("[면색: " + fillColor + ", 선색: " + lineColor + ", 지름: " + radius + "] 원을 그렸습니다.");
	}

	

}
