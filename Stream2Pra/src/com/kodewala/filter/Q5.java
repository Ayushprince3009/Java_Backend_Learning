package com.kodewala.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q5 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(
			    5, 12, 15, 20, 25, 30, 33, 40,
			    45, 50, 60, 75, 81, 90, 100
			);
		
		List<Integer> result = numbers.stream()
				.filter(num -> (num > 20 && num < 90) && (num % 3 == 0 || num % 5 == 0))
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
