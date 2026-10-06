package com.kodewala.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q2 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList(
			    "Amit", "Rahul", "Ankit", "Priya",
			    "Rohit", "Neha", "Arjun", "Raj"
			);
		
		List<Integer> result = names.stream()
				.filter(name -> name.length() > 4)
				.map(name -> name.length())
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
