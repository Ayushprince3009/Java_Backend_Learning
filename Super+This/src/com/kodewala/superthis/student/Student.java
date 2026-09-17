package com.kodewala.superthis.student;

public class Student {
	private String name;
	private int age;
	
	public Student() {
		this("unknown");
	}
	
	public Student(String name) {
		this(name, 18);
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayDetails() {
		System.out.println("Name:- "+name);
		System.out.println("Age:- "+age);
	}
}
