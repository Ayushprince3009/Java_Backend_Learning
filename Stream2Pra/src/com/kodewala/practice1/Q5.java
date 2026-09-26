package com.kodewala.practice1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q5 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee("Harsh", "IT", 90000),
			    new Employee("Nisha", "HR", 50000),
			    new Employee("Raj", "Engineering", 85000),
			    new Employee("Divya", "Finance", 65000),
			    new Employee("Yash", "IT", 78000),
			    new Employee("Pallavi", "Engineering", 82000),
			    new Employee("Sameer", "HR", 55000),
			    new Employee("Ritika", "Finance", 70000),
			    new Employee("Abhishek", "IT", 76000),
			    new Employee("Mansi", "Engineering", 88000)
			);
		
		Map<String,List<Employee>> res = employees.stream()
				.skip(2)
				.limit(5)
				.collect(Collectors.groupingBy(emp->emp.getDepartment()));
		System.out.println(res);
	}
}
