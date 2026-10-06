package com.kodewala.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q2 {
	public static void main(String[] args) {
		List<List<Integer>> numbers = Arrays.asList(
			    Arrays.asList(1, 2, 3, 4),
			    Arrays.asList(5, 6, 7),
			    Arrays.asList(8, 9, 10, 11)
			);
		
		List<Integer> result = numbers.stream()
				.flatMap(num -> num.stream())
				.filter(num -> num > 5)
				.collect(Collectors.toList());
		System.out.println(result);
				
	}
}
