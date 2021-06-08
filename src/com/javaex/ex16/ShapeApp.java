package com.javaex.ex16;

public class ShapeApp {

	public static void main(String[] args) {

		Rectangle[] rArray = new Rectangle[3];

		Rectangle r01 = new Rectangle("빨강", "검정", 5, 5);
		Rectangle r02 = new Rectangle("노랑", "검정", 6, 6);
		Rectangle r03 = new Rectangle("검정", "검정", 7, 7);

		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;

		for (int i = 0; i < rArray.length; i++) {
			rArray[i].draw();
		}

//		r01.draw();
//		r02.draw();
//		r03.draw();
		Circle[] cArray = new Circle[3];
		Circle c01 = new Circle("Red", "Black", 11);
		Circle c02 = new Circle("Yellow", "Black", 22);
		Circle c03 = new Circle("Black", "Black", 33);
		System.out.println("===========================================================");
		c01.draw();
		c02.draw();
		c03.draw();
	}

}
