package com.kodewala.streamAPI.practice5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver2 {
	public static void main(String[] args) {
		List<Employee> staff = Arrays.asList(
				new Employee("Alice", "Engineering", 95000),
				new Employee("Bob", "Marketing", 62000),
				new Employee("Charlie", "Engineering", 88000),
				new Employee("Diana", "HR", 72000),
				new Employee("Eve", "Engineering", 105000),
				new Employee("Frank", "Marketing", 58000),
				new Employee("Grace", "HR", 78000)
				);
		
		
		List<String> output = staff.stream()
				.filter(emp -> emp.getSalary() > 75000)
				.map(emp -> emp.getName())
				.collect(Collectors.toList());
		
		System.out.println(output);
	}
}

class Employee {
	String name;
	String dept;
	double salary;

	Employee(String n, String d, double s) {
		name = n;
		dept = d;
		salary = s;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
}



