package com.kodewala.constructorChaining.compamny;

public class Company {
	private String companyName;
	
	public Company(String companyName) {
		this.companyName = companyName;
	}
	
	public String getCompanyName() {
		return companyName;
	}
}

class Employee extends Company{
	private String employeeName;
	
	public Employee(String company, String employeeName) {
		super(company);
		this.employeeName = employeeName;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
}

class Manager extends Employee{
	private String department;
	
	public Manager(String companyName, String employeeName, String department) {
		super(companyName, employeeName);
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
}

class Display extends Manager{
	public Display(String companyName, String employeeName, String department) {
		super(companyName, employeeName, department);
	}
	
	public void displayDetails() {
		System.out.println("Company Name:- "+getCompanyName());
		System.out.println("Employee Name:- "+getEmployeeName());
		System.out.println("Departmnent:- "+getDepartment());
		System.out.println();
	}
}