package com.kodewala.practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q3 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(
			    12, 7, 25, 40, 18, 33, 50, 9, 64, 21
			);
		
		List<Integer> result = numbers.stream()
				.filter(n -> (n > 20) && (n % 5 == 0))
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
