package com.kodewala.streamAPI.practice3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver6 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(
			    50, 20, 10, 50, 30, 20, 40, 10, 60, 30
			);
		
		List<Integer> num = numbers.stream()
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(num);
	}
}
