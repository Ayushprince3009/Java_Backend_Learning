package com.kodewala.streamAPI.practice3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver4 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(
			    10, 15, 20, 25, 30, 35, 40, 45
			);
		
		List<Integer> result = numbers.stream()
				.filter(num -> (num % 2 == 0))
				.collect(Collectors.toList());
		
		System.out.println(result);
	}
}
