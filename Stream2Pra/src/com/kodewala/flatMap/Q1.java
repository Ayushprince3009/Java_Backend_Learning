package com.kodewala.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q1 {
	public static void main(String[] args) {
		List<List<Integer>> numbers = Arrays.asList(
			    Arrays.asList(1, 2, 3),
			    Arrays.asList(4, 5, 6),
			    Arrays.asList(7, 8, 9)
			);
		
		List<Integer> result = numbers.stream()
				.flatMap(num -> num.stream())
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
