package com.kodewala.superthis.cls4;

public class Person {
	private String name;
	private int age;
	private String city;
	
	public Person(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getCity() {
		return city;
	}
}

class Student extends Person{
	private String course;
	private String college;
	
	public Student(String name, int age, String city, String course,String college) {
		super(name,age,city);
		this.course = course;
		this.college = college;
	}
	
	void displayDetails() {
		System.out.println("Name:- "+getName());
		System.out.println("Age:- "+getAge());
		System.out.println("City:- "+getCity());
		System.out.println("College:- "+college);
		System.out.println();
	}
	
}