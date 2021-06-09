package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		//Constructing Array
		Shape[] sArray = new Shape[4];
		
		
		//Constructing figure
		Shape sr01 = new Rectangle ("빨강", "검정", 10, 10);
		Shape sc01 = new Circle ("주황", "검정", 30);
		Shape st01 = new Triangle ("노랑", "검정", 5, 5);
		Shape ss01 = new Shape ("검정", "검정");
		
		
		//Array <-- Figure
		sArray[0] = sr01;
		sArray[1] = sc01;
		sArray[2] = st01;
		sArray[3] = ss01;
		
		//
		for(int i = 0; i <sArray.length; i++) {
			sArray[i].draw();
		}
		((Rectangle)sr01).getWidth();
		
		
		//Casting
		
		
//		Shape[] sArray = new Shape[3];
//		
//		Rectangle r01 = new Rectangle ("빨강", "검정", 10, 10);
//		Circle c01 = new Circle("주황", "검정", 30);
//		Triangle t01= new Triangle("노랑", "검정", 5, 5);
//		
//		sArray[0] = r01;
		
	}
}
