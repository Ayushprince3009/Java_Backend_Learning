package com.kodewala.distinc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(
			    10, 20, 10, 30, 20, 40, 30, 50
			);
		
		List<Integer> result = numbers.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
