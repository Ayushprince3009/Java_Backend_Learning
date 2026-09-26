package com.kodewala.practice1;

import java.util.List;

public class Employee{
	private String name;
	private String department;
	private double salary;
	
	public Employee(String name, String department,double salary) {
		this.name = name; 
		this.department = department;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return getName();
	}
}	


//class Employee {
//    String name;
//    String department;
//    List<String> skills;
//
//    Employee(String name, String department, List<String> skills) {
//        this.name = name;
//        this.department = department;
//        this.skills = skills;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//
//    public List<String> getSkills() {
//        return skills;
//    }
//}