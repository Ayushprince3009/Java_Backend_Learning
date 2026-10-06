package com.kodewala.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q5 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(
			    5, 10, 15, 20, 25, 30, 35, 40,
			    45, 50, 55, 60, 65, 70, 75, 80
			);
		
		List<Integer> result = numbers.stream()
				.filter(num -> ((num > 20) && (num < 70)) && ((num % 3 == 0) || (num % 5 == 0)))
				.map(num -> (num * num))
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
