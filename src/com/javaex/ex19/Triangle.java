package com.javaex.ex19;

public class Triangle extends Shape{
	
	//Field
	private int width;
	private int height;
	
	//Constructor
	public Triangle() {
//		super(); Shape() -->> 표기는 슈퍼
	}
	
	public Triangle (String fillColor, String lineColor, int width, int height) {
//		super(fillColor, lineColor);
		super.setFillColor(fillColor);
		super.setLineColor(lineColor);
		this.width = width;
		this.height = height;
	}

	
	//Method - G/S
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}

	//Method - Ordinary
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	public void draw() {
		System.out.println("[면색: " + super.fillColor + ", 선색: " + lineColor + ", 가로: " + width + ", 세로: " + height + "] 삼각형을 그렸습니다.");
		System.out.println("Triangle");
	}
	
	public double area() {
		return (width*height);
	}

}
