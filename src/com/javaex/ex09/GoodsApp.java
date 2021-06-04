package com.javaex.ex09;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods computer = new Goods("그램", 100000);
		
		Goods camera = new Goods("니콘", 4000000);

		Goods cup = new Goods("머그컵", 2000);
		
		Goods[] goodsArray = new Goods[3];
		goodsArray[0] = computer;
		goodsArray[1] = camera;
		goodsArray[2] = cup;
		
		for (int i = 0 ; i<3; i++) {
		goodsArray[i].showInfo();
		}
	}
}