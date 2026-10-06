package com.kodewala.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q3 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(
			    5, 12, 15, 20, 25, 30, 33, 40
			);
		List<Integer> result = numbers.stream()
				.filter(num -> (num>15))
				.map(num -> (num*num))
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
