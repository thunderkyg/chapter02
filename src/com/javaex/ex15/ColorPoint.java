package com.javaex.ex15;

public class ColorPoint {
	
	//Field
	private String fillColor;
	private String lineColor;
	private int width;
	private int height;
	
	
	//Constructor
	public ColorPoint() {
		
	}
	
	public ColorPoint(String fillColor, String lineColor, int width, int height) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.width = width;
		this.height = height;
	}

}
