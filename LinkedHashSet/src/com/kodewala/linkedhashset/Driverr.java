package com.kodewala.linkedhashset;

import java.util.Set;
import java.util.TreeSet;

class Employee{
	private String name;
	private int empId;
	
	public Employee(String name, int empId) {
		super();
		this.name = name;
		this.empId = empId;
	}
}
public class Driverr {
	public static void main(String[] args) {
		Set<Employee> emp = new TreeSet<Employee>();
		emp.add(new Employee("Ayush", 123));
		
		System.out.println(emp);
	}
}
