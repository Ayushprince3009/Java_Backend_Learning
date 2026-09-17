package com.kodewala.updowncasting.pq3;

public class Employee {
	void login() {
		System.out.println("Logged In");
	}
	
	void logout() {
		System.out.println("Logged Out");
	}
}

class Developer extends Employee{
	void writeCode() {
		System.out.println("Writting Code.....");
	}
}
