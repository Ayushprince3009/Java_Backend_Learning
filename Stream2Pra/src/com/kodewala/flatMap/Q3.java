package com.kodewala.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q3 {
	public static void main(String[] args) {
		List<List<String>> names = Arrays.asList(
			    Arrays.asList("Amit", "Rahul", "Ankit"),
			    Arrays.asList("Priya", "Rohit", "Neha"),
			    Arrays.asList("Arjun", "Raj", "Suresh")
			);
		
		List<String> result = names.stream()
				.flatMap(name -> name.stream())
				.filter(name -> name.length() > 4)
				.map(name -> name.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
