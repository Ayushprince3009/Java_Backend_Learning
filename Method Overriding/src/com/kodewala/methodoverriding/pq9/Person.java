package com.kodewala.methodoverriding.pq9;

public class Person {
	void displayRole() {
		System.out.println("Person");
	}
}

class Doctor extends Person{
	@Override
	void displayRole() {
		System.out.println("Doctor");
	}
}

class Surgeon extends Doctor{
	@Override
	void displayRole() {
		System.out.println("Surgeon");
	}
	void displaySalary() {
		System.out.println("90000");
	}
}
