package com.kodewala.constructor;

public class Student {
	private String name;
	private int rollNo;

	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;

	}
	
	public String getName(String name) {
		return name;
	}
	
	public int getRollNo(int rollNo) {
		return rollNo;
	}
	
	public void displayDetails() {
		System.out.println("Name:- "+name);
		System.out.println("Roll No:- "+rollNo);
	}
}
