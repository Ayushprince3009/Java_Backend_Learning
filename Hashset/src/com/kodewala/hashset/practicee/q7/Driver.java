package com.kodewala.hashset.practicee.q7;

import java.util.HashSet;
import java.util.Set;

public class Driver {
	public static void main(String[] args) {
		Set<Employee> employee = new HashSet<Employee>();
		Employee e1 = new Employee("Ayush", 101);
		Employee e2 = new Employee("Ayush", 101);
		Employee e3 = new Employee("Ayush",101);
		
		employee.add(e3);
		employee.add(e2);
		employee.add(e1);
		
		System.out.println(employee);
		System.out.println(employee.size());
	}
}

class Employee{
	private String name;
	private int id;
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		return this.id + this.name.hashCode() ;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee)obj;
		return this.id == emp.id && this.name.equals(emp.name);
	}
	
}