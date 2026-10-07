package com.kodewala.distinc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q2 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList(
			    "Amit", "Rahul", "Amit", "Priya",
			    "Rahul", "Rohit", "Priya", "Neha"
			);
		List<String> result = names.stream()
				.filter(name -> name.length()>4)
				.distinct()
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
