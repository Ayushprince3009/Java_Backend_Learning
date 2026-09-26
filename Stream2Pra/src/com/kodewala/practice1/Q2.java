package com.kodewala.practice1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q2 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee("Amit", "Engineering", 65000),
			    new Employee("Riya", "Marketing", 55000),
			    new Employee("Suresh", "Engineering", 85000),
			    new Employee("Pooja", "IT", 72000),
			    new Employee("Arjun", "IT", 48000),
			    new Employee("Meena", "Marketing", 68000)
			);
		
		Map<String,List<Employee>> res = employees.stream()
				.filter(emp -> emp.getSalary() > 60000)
				.collect(Collectors.groupingBy(emp -> emp.getDepartment()));
		
		System.out.println(res);
	}
}
