package com.javaex.ex13;

public class Student extends Person{

	//Field
	private String schoolName;
	
	//Constructor
	
	public Student() {
		
	}
	
	public Student(String schoolName) {
		this.schoolName	= schoolName;
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
	
	public void showInfo() {
		System.out.println("이름: " + getName());
		System.out.println("나이: " + getAge());
		System.out.println("학교: " + schoolName);
	}

}
