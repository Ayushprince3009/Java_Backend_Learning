package com.kodewala.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(
			    2, 4, 6, 8, 10
			);
		List<Integer> result = numbers.stream()
				.map(num -> num*num)
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
