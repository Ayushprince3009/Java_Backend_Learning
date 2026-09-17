package com.kodewala.constructorChaining.thissuper.student;

public class Student {
	private String name = "Unknown";
	private int age = 18;
	
	public Student() {
		
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayDetails() {
		System.out.println("Name:- "+name);
		System.out.println("Age:- "+age);
		System.out.println();
	}
}
