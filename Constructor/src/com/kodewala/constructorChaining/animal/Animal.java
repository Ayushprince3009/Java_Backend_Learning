package com.kodewala.constructorChaining.animal;

public class Animal {
	private String name;
	private int age;
	
	Animal(String name, int age){
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

class Student extends Animal{
	private String course;
	
	Student(String name, int age, String course){
		super(name, age);
		this.course = course;
	}
	
	public void displayDetails() {
		System.out.println("Student Name:- "+getName());
		System.out.println("Student Age:- "+getAge());
		System.out.println("Course:- "+course);
		System.out.println();
	}
}
