package com.kodewala.sortedDesc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q4 {
	public static void main(String[] args) {
		List<List<String>> names = Arrays.asList(
			    Arrays.asList("Rahul", "Amit", "Ankit", "Rohit"),
			    Arrays.asList("Priya", "Arjun", "Suresh", "Neha"),
			    Arrays.asList("Karan", "Rahul", "Vijay", "Ankit"),
			    Arrays.asList("Rohit", "Arjun", "Amit", "Suresh")
			);
		
		List<String> res = names.stream()
				.flatMap(name -> name.stream())
				.filter(name -> ((name.length() == 5) || (name.length() == 6))
						&& ((name.startsWith("A")) ||
								(name.startsWith("R"))
								|| (name.startsWith("S")))
						)
				.distinct()
				.map(name -> name.toUpperCase())
				.sorted((a,b) -> b.compareTo(a))
				.collect(Collectors.toList());
		System.out.println(res);
				
	}
}
