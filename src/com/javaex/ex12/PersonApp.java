package com.javaex.ex12;

public class PersonApp {

	public static void main(String[] args) {
		
		Person p00 = new Person("정우성", 46);
		System.out.println(p00.toString());
		p00.showInfo();
		Student s00 = new Student("김영기", 25, "Universal");
		System.out.println(s00.toString());
	}

}
