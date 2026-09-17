package com.kodewala.constructorChaining.parent;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}

class Student extends Person{
	private String course;
	
	public Student(String name, int age, String course) {
		super(name,age);
		this.course = course;
		
	}
	
	public void displayDetails() {
		System.out.println("Name:- "+getName());
		System.out.println("Age:- "+getAge());
		System.out.println("Course:- "+course);
		System.out.println();
	}
}
