package com.kodewala.distinc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q3 {
	public static void main(String[] args) {
		List<List<Integer>> numbers = Arrays.asList(
			    Arrays.asList(1, 2, 3, 4),
			    Arrays.asList(3, 4, 5, 6),
			    Arrays.asList(5, 6, 7, 8)
			);
		
		List<Integer> result = numbers.stream()
				.flatMap(num -> num.stream())
				.filter(num -> num > 3)
				.distinct()
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
