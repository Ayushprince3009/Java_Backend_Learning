package com.kodewala.sortedasc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q3 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList(
			    "Rahul", "Amit", "Suresh", "Ankit",
			    "Priya", "Rohit", "Arjun", "Neha"
			);
		
		List<String> res = names.stream()
				.filter(name -> name.length()>4)
				.sorted()
				.collect(Collectors.toList());
		System.out.println(res);
	}
}
