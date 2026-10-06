package com.kodewala.practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q2 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList(
			    "Amit", "Rahul", "Ankit", "Priya",
			    "Rohit", "Neha", "Arjun", "Raj"
			);
		
		List<String> result = names.stream()
				.filter(n -> n.length() > 4)
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
