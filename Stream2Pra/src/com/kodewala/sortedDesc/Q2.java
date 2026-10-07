package com.kodewala.sortedDesc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q2 {
	public static void main(String[] args) {
		List<List<String>> employees = Arrays.asList(
			    Arrays.asList("Rahul", "Amit", "Suresh", "Ankit"),
			    Arrays.asList("Priya", "Rohit", "Rahul", "Arjun"),
			    Arrays.asList("Karan", "Suresh", "Vijay", "Ankit"),
			    Arrays.asList("Rohit", "Amit", "Arjun", "Raj")
			);
		List<String> res = employees.stream()
				.flatMap(emp->emp.stream())
				.filter(emp -> (emp.length()>4)
						&& ((emp.startsWith("A"))
								|| (emp.startsWith("R"))
								|| (emp.startsWith("S"))))
				.distinct()
				.map(emp -> emp.toUpperCase())
				.sorted((a,b) -> b.compareTo(a))
				.collect(Collectors.toList());
		System.out.println(res);
				
	}
}
