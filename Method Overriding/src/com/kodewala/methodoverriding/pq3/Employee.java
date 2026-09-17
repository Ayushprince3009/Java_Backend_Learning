package com.kodewala.methodoverriding.pq3;

class Employee {
	private String employe;
	private String developer;
	
	void work() {
		System.out.println("Working");
	}
}

class Developer extends Employee{
	@Override
	void work() {
		System.out.println("Developer is working");
	}
}

