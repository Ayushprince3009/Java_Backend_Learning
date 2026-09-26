package com.kodewala.practice1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q4 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee("Varun", "Engineering", 75000),
			    new Employee("Isha", "IT", 68000),
			    new Employee("Mohit", "Engineering", 82000),
			    new Employee("Tanya", "HR", 50000),
			    new Employee("Aditya", "IT", 72000),
			    new Employee("Komal", "Engineering", 79000)
			);
//		Map<String, List<String>> res = employees.stream()
//		        .collect(Collectors.groupingBy(
//		                emp -> emp.getDepartment(),
//		                Collectors.mapping(
//		                        emp -> emp.getName(),
//		                        Collectors.toList()
//		                )
//		        ));
		
		Map<String, List<String>> result = employees.stream()
				.collect(Collectors.groupingBy(
						emp->emp.getDepartment(),
						Collectors.mapping(emp->emp.getName(),
								Collectors.toList())));

		System.out.println(result);
	}
}
