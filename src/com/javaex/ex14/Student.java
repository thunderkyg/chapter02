package com.javaex.ex14;

public class Student extends Person{

	//Field
	private String schoolName;
	
	//Constructor
	
	public Student() {
		System.out.println("Student()");
	}
	
//	public Student(String name, int age, String schoolName) {
//		this.setName(name);
//		this.setAge(age);
//		super(name, age);
//		
//		super();
//		this.schoolName	= schoolName;
//		System.out.println("Student(3)");
//	}
	
	public Student(String name, int age, String schoolName) {
		super();
		super.setName(name);
		super.setAge(age);
		this.schoolName = schoolName;
	}

	
	
	//Method - G/S
	public String getSchoolName() {
		return schoolName;
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	//Testing 
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "age=" + getAge() + "]";
	}
	
	//Method - Ordinary
	
	public void showInfo(boolean on) {
		System.out.println("=================================");
		System.out.println("이름: " + super.name);
		System.out.println("나이: " + getAge());
		System.out.println("학교: " + schoolName);
		System.out.println("=================================");
	}

}
