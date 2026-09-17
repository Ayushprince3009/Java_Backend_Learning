package com.kodewala.streamAPI.practice5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(
				-5, 3, 8, -12, 7, 0, 14, -3, 21, 10,
				33, -8, 42, 1, 100, -1, 55, 0, 77, -20
				);
		
		List<Integer> output = numbers.stream()
				.filter(num -> (num > 0))
				.filter(num -> (num % 2 == 0))
				.collect(Collectors.toList());
		
		System.out.println(output);
	}
}
