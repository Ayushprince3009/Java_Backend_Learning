package com.kodewala.hashset.practicee.q8;

import java.util.HashSet;
import java.util.Set;

public class Driver {
	public static void main(String[] args) {
		Set<Employee> employee = new HashSet<Employee>();
		
		Employee e1 = new Employee("Ayush" ,"IT", 101);
		Employee e2 = new Employee("Rahul","HR",101);
		Employee e3 = new Employee("Aman", "IT", 101);
		Employee e4 = new Employee("Ayush", "IT", 102);
		Employee e5 = new Employee("Rohit","IT",102);
		
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		employee.add(e4);
		employee.add(e5);
		
		System.out.println(employee.size());
		
	}
}

class Employee{
	private String name;
	private String department;
	private int id;
	
	public Employee(String name, String department, int id){
		this.name = name;
		this.department = department;
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		return id + this.department.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee)obj;
		return this.id == emp.id && this.department.equals(emp.department);
	}
	
}