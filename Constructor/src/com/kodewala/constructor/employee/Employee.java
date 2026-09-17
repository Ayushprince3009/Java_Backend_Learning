package com.kodewala.constructor.employee;

public class Employee {
	private String empId;
	private String name;
	private int salary;
	
	public Employee(String empId, String name, int salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public String getEmpId(String empId) {
		return empId;
	}
	
	public String getName(String name) {
		return name;
	}
	public int getSalary(int salary) {
		return salary;
	}
	
	public void displayDisplay() {
		System.out.println("Emp Id:- "+empId);
		System.out.println("Name:- "+name);
		System.out.println("Slary:- "+salary);
		System.out.println();
	}
}
