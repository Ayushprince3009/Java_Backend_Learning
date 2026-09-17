package com.kodewala.superthis.cls2;

public class Employee {
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
}

class Manager extends Employee{ 
	private String department;
	
	public Manager(String name, double salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	void displayDetails() {
		System.out.println(getName());
		System.out.println(getSalary());
		System.out.println(department);
	}
}

