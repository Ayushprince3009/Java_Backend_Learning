package com.kodewala.methodoverriding.pq5;

public class Employee {
	void work() {
		System.out.println("Do work");
	}
}

class Developer extends Employee{
	void work() {
		System.out.println("Do work Developer");
	}
}

