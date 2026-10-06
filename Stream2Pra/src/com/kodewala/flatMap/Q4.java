package com.kodewala.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q4 {
	public static void main(String[] args) {
		List<List<Integer>> numbers = Arrays.asList(
			    Arrays.asList(10, 15, 20, 25),
			    Arrays.asList(30, 35, 40, 45),
			    Arrays.asList(50, 55, 60, 65)
			);
		
		List<Integer> result = numbers.stream()
				.flatMap(number -> number.stream())
				.filter(num -> ((num > 20) && (num < 60)) && (num % 5 == 0))
				.map(num -> num*num)
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
