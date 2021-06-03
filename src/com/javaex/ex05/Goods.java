package com.javaex.ex05;

public class Goods {

	
//	필드
	private String name;
	private int price;
	
//	생성자
	public Goods() {
//		Goods 메모리(힙)에 올리는거
	}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
//	메소드 - 겟터셋터
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void showInfo() {
		System.out.println(name + ", " + price);
	}
	
}
