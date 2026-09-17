package com.kodewala.superthisinsame.cls1;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

class Student extends Person{
	private String course;
	
	public Student() {
		this("ayush");
	}
	
	public Student(String name) {
		this(name, "java");
	}
	
	public Student(String name,String course) {
		super(name);
		this.course = course;
	}
	
	public void displayDetails() {
		System.out.println("Name:- "+getName());
		System.out.println("Course:- "+course);
		System.out.println();
	}
}
