package com.kodewala.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q4 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList(
			    "Amit", "Rahul", "Ankit", "Priya",
			    "Rohit", "Neha", "Arjun", "Raj",
			    "Suresh", "Karan"
			);
		
		List<String> result = names.stream()
				.filter(name -> (name.length()>4) && (name.startsWith("A") || name.startsWith("R")))
				.map(name -> name.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(result);
		
	}
}
