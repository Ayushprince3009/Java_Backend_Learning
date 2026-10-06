package com.kodewala.practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q4 {
	public static void main(String[] args) {
		List<String> employees = Arrays.asList(
			    "Amit", "Rahul", "Ankit", "Priya",
			    "Rohit", "Neha", "Arjun", "Raj",
			    "Suresh", "Karan"
			);
		
//		List<String> result = employees.stream()
//				.filter(name -> (name.startsWith("R") || name.startsWith("A")))
//				.filter(name -> (name.length()>4))
//				.collect(Collectors.toList());
//		System.out.println(result);
		
		List<String> result = employees.stream()
				.filter(name -> (name.startsWith("R") || name.startsWith("A")) && name.length() > 4)
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
