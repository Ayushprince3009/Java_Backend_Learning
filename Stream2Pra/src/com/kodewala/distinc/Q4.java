package com.kodewala.distinc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q4 {
	public static void main(String[] args) {
		List<List<String>> names = Arrays.asList(
			    Arrays.asList("Amit", "Rahul", "Ankit", "Rahul"),
			    Arrays.asList("Priya", "Rohit", "Ankit", "Neha"),
			    Arrays.asList("Arjun", "Rahul", "Suresh", "Priya")
			);
		
		List<String> result = names.stream()
				.flatMap(name -> name.stream())
				.filter(name -> (name.length()>4) && ((name.startsWith("A")) || name.startsWith("R")))
				.map(name -> name.toUpperCase())
				.distinct()
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
