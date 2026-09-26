package com.kodewala.practice1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q3 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee("Rohan", "IT", 60000),
			    new Employee("Simran", "HR", 45000),
			    new Employee("Deepak", "IT", 70000),
			    new Employee("Anjali", "Finance", 55000),
			    new Employee("Manish", "HR", 50000),
			    new Employee("Kavita", "IT", 80000),
			    new Employee("Nitin", "Finance", 65000),
			    new Employee("Shweta", "HR", 52000)
			);
		
		Map<String,Long> res = employees.stream()
				.collect(Collectors.groupingBy(emp -> emp.getDepartment(),Collectors.counting()));
		
		System.out.println(res);
	}
}
