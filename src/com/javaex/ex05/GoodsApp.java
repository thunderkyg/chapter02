package com.javaex.ex05;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		
		
		
		Goods computer = new Goods("그램", 1000000);
		camera.showInfo();
		System.out.println("=================");
		computer.showInfo();
		
		
	}

}
