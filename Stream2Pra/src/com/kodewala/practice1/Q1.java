package com.kodewala.practice1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q1 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee("Rahul", "Engineering", 70000),
			    new Employee("Priya", "HR", 45000),
			    new Employee("Karan", "Engineering", 80000),
			    new Employee("Sneha", "Finance", 55000),
			    new Employee("Vikas", "HR", 50000),
			    new Employee("Neha", "Engineering", 75000)
			);
		
		Map<String,List<Employee>> result = employees.stream()
				.collect(Collectors.groupingBy(emp -> emp.getDepartment()));
		System.out.println(result);
	}
}
