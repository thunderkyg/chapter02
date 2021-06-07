package com.javaex.ex12;

public class Student{

	//Field
	private String name;
	private int age;
	private String schoolName;
	
	//Constructor
	
	public Student() {
		
	}
	
	public Student(String name, int age, String schoolName) {
		this.name = name;
		this.age = age;
		this.schoolName	= schoolName;
	}
	
	//Method - G/S
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	
	//Testing 
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", schoolName=" + schoolName + "]";
	}
	
	
	//Method - Ordinary
	
}
