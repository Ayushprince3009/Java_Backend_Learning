package com.kodewala.streamAPI.practice4;

//salary above 50k

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver2 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee("Ayush", 45000),
			    new Employee("Rahul", 60000),
			    new Employee("Amit", 75000),
			    new Employee("Priya", 40000),
			    new Employee("Neha", 90000)
			);
		
		List<String> result = employees.stream()
				.filter(emp -> emp.getSalary() > 50000)
				.map(emp -> emp.getName())
				.collect(Collectors.toList());
		
		System.out.println(result);
		
//		employees.stream().filter(emp -> emp.getSalary() > 50000)
//		.map(emp -> emp.getName()).forEach(emp -> System.out.println(emp));

	}
}

class Employee{
	private String name;
	private int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
}