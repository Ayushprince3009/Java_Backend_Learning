package com.kodewala.inheritance.employee;

public class Employee {
	private int empId;
	private double salary;
	
	public Employee(int empId, double salary) {
		this.empId = empId;
		this.salary = salary;
	}
	
	void employeeDetails() {
		System.out.println("Emp Id:- "+empId);
		System.out.println("Salary:- "+salary);
	}
	
}

class Manager extends Employee{
	private String department;
	
	public Manager(int empId, double salary, String department) {
		super(empId, salary);
		this.department = department;
	}
	
	void managerDetails() {
		employeeDetails();
		System.out.println("Department:- "+department);
	}
}