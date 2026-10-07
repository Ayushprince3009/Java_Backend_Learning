package com.kodewala.sortedasc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q5 {
	public static void main(String[] args) {
		List<List<String>> names = Arrays.asList(
			    Arrays.asList("Rahul", "Amit", "Ankit", "Raj"),
			    Arrays.asList("Priya", "Rohit", "Neha", "Arjun"),
			    Arrays.asList("Suresh", "Karan", "Ravi", "Ankit"),
			    Arrays.asList("Rahul", "Amit", "Vijay", "Arjun")
			);
		List<String> res = names.stream()
				.flatMap(name -> name.stream())
				.filter(name -> (name.length()>4)
						&& ((name.startsWith("A")) ||
								(name.startsWith("R"))))
				.distinct()
				.map(name -> name.toUpperCase())
				.sorted()
				.collect(Collectors.toList());
		System.out.println(res);
				
				
	}
}
