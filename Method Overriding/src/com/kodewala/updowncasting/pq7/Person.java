package com.kodewala.updowncasting.pq7;

public class Person {
	void walk() {
		System.out.println("Walk");
	}
}
class Employee extends Person{
	void login() {
		System.out.println("login");
	}
}
class Developer extends Employee{
	void writeCode() {
		System.out.println("Write Code");
	}
}
