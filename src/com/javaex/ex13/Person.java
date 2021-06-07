package com.javaex.ex13;

public class Person {
	
	
	//Field
	private String name;
	private int age;
	
	//Constructor
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//Method - G/S
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//데이터 확인용
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	//Method - Ordinary
	public void showInfo() {
		System.out.println("=================================");
		System.out.println("이름: " + name + ", 나이: " + age);
		System.out.println("=================================");
	}

}
