package com.kodewala.inheritance.q1;

public class Employee {
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	public void login() {
		System.out.println("Employee Logged In");
	}
	
	public void logout() {
		System.out.println("Employee Logged Out");;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
}

class Developer extends Employee{
	private String programmingLanguage;
	
	public Developer(String name, double salary, String programmingLanguage) {
		super(name,salary);
		this.programmingLanguage = programmingLanguage;
	}
	
	public void writeCode() {
		System.out.println("Writing java code");
	}
	
	public void displayDetails() {
		System.out.println("Name:- "+getName());
		System.out.println("Salary:- "+getSalary());
		System.out.println("Language:- "+programmingLanguage);
		super.login();
		writeCode();
		super.logout();
	}
}

