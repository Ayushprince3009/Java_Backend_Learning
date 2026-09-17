package com.kodewala.hashset.practicee;

import java.util.HashSet;
import java.util.Set;

class Employee{
	private String name;
	private int id;
	
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
}
public class Driver {
	public static void main(String[] args) {
		Set<Employee> employee = new HashSet<Employee>(64);
		
		Employee e1 = new Employee("Kodewala",123);
		Employee e2 = new Employee("Kodewala",123);
		Employee e3 = new Employee("Kodewala",123);
		Employee e4 = new Employee("Kodewala",123);
		Employee e5 = new Employee("Kodewala",123);
		Employee e6 = new Employee("Kodewala",123);
		Employee e7 = new Employee("Kodewala",123);
		Employee e8 = new Employee("Kodewala",123);
		Employee e9 = new Employee("Kodewala",123);
		
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		employee.add(e4);
		employee.add(e5);
		employee.add(e6);
		employee.add(e7);
		employee.add(e8);
		employee.add(e9);
		
		System.out.println(employee);
		
	}
}
