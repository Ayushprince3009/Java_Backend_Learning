package com.kodewala.superthis.cls5;

public class Company {
	private String companyName;
	private String location;
	
	public Company(String companyName, String location) {
		this.companyName = companyName;
		this.location = location;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public String getLocation() {
		return location;
	}
}

class Employee extends Company{
	private String name;
	private double salary;
	
	public Employee(String companyName, String location, String name, double salary) {
		super(companyName,location);
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

class Developer extends Employee{
	private String language;
	private int experience;
	
	public Developer(String companyName, String location, String name, double salary, String language, int experience) {
		super(companyName,location,name,salary);
		this.language = language;
		this.experience = experience;
	}
	
//	public String getLanguage() {
//		return language;
//	}
//	
//	public int getExperience() {
//		return experience;
//	}
	
	void displayDetails() {
		System.out.println("Company:- "+getCompanyName());
		System.out.println("Location:- "+getLocation());
		System.out.println("Name:- "+getName());
		System.out.println("Salary:- "+getSalary());
		System.out.println("Language:- "+language);
		System.out.println("Experience:- "+experience+" yrs.");
		System.out.println();
	}
}
