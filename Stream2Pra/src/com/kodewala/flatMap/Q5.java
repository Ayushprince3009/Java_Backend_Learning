package com.kodewala.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q5 {
	public static void main(String[] args) {
		List<List<String>> names = Arrays.asList(
			    Arrays.asList("Amit", "Rahul", "Ankit", "Raj"),
			    Arrays.asList("Priya", "Rohit", "Neha", "Arjun"),
			    Arrays.asList("Suresh", "Karan", "Ravi", "Ankit"),
			    Arrays.asList("Rahul", "Amit", "Vijay", "Arjun")
			);
		
		List<String> result = names.stream()
				.flatMap(name -> name.stream())
				.filter(name -> (name.length()>4) && ((name.startsWith("A") || (name.startsWith("R")))))
				.map(name -> name.toUpperCase())
				.distinct()
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
