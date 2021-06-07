package com.javaex.ex14;

public class PersonApp {
	
	public static void main(String[] args) {
		
//		Student s01 = new Student();
//		s01.setName("정우성");
//		s01.setAge(50);
//		s01.setSchoolName("서울고등학교");
//		
//		System.out.println(s01.getName());
//		System.out.println(s01.getAge());
//		System.out.println(s01.getSchoolName());
		
//		s01.showInfo();
		
		//Student Constructor
//		Student s02 = new Student("이효리", 45, "제주고등학교");
//		s02.showInfo();
		
//		Student s03 = new Student();
		
		Student s04 = new Student("이효리", 45, "제주고등학교");
		
		Person p = new Person();
		p.name = "바보야";
		
		s04.showInfo(true);
		
	}
	

}
