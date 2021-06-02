package com.javaex.ex02;

public class GoodApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		Goods computer = new Goods();
		Goods cup = new Goods();
		
		// ONLY USING FIELD
		
//		camera.name = "니콘";
//		camera.price = 400000;
		
		
//		computer.name = "그램";
//		computer.price = 1000000;
//		
//		cup.name = "머그컵";
//		cup.price = 2000;
		
//		System.out.println("상품명: " + camera.name + ",  가격:" + camera.price);
//		System.out.println("상품명: " + computer.name + ",  가격:" + computer.price);
//		System.out.println("상품명: " + cup.name + ",  가격:" + cup.price);
		
		// USING PRIVATE FIELD AND METHODS
			
		camera.setName("니콘");
		camera.setPrice(400000);

		computer.setName("그램");
		computer.setPrice(1000000);

		cup.setName("머그컵");
		cup.setPrice(2000);
//		
//		System.out.println("상품명: " + camera.getName() + ",  가격:" + camera.getPrice());
//		System.out.println("상품명: " + computer.getName() + ",  가격:" + computer.getPrice());
//		System.out.println("상품명: " + cup.getName() + ",  가격:" + cup.getPrice());
		
		camera.showInfo();
		computer.showInfo();
		cup.showInfo();
		
		
	}

}
