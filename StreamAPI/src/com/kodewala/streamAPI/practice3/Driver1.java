package com.kodewala.streamAPI.practice3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver1 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee("Ayush", 50000),
			    new Employee("Rahul", 60000),
			    new Employee("Priya", 70000)
			);
		
		List<String> result = employees.stream()
				.map(emp -> emp.getName())
				.collect(Collectors.toList());
		
		System.out.println(result);
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