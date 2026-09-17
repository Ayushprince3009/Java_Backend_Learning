package com.kodewala.constructorChaining.thissuperr;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
}

class Student extends Person{
	private String course;
	
	public Student() {
		this("unknown");
	}
	
	public Student(String name) {
		this(name,"course");
	}
	
	public Student(String name, String course) {
		super(name);
		this.course = course;
	}
}
