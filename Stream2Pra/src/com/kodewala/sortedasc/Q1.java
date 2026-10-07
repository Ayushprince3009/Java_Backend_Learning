package com.kodewala.sortedasc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(
			    45, 12, 78, 23, 9, 56, 34
			);
		List<Integer> res = numbers.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(res);
	}
}
