package com.kodewala.methodoverriding.pq7;

public class Person {
	public Person() {
		super();
		System.out.println("Person Constructor");
	}
	
	public void display() {
		System.out.println("Person Display");
	}
}

class Employee extends Person{
	public Employee() {
		super();
		System.out.println("Employee Constructor");
	}
	
	public void display() {
		System.out.println("Employee Display");
	}
}
