package com.kodewala.sortedDesc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q3 {
	public static void main(String[] args) {
		List<List<Integer>> numbers = Arrays.asList(
			    Arrays.asList(12, 25, 36, 45, 52),
			    Arrays.asList(18, 25, 42, 63, 72),
			    Arrays.asList(30, 36, 48, 55, 81),
			    Arrays.asList(42, 60, 63, 75, 90)
			);
		
		List<Integer> res = numbers.stream()
				.flatMap(num -> num.stream())
				.filter(num -> ((num >= 30) && (num <= 90)))
				.filter(num -> (num % 3 == 0))
				.distinct()
				.map(num -> (num*num))
				.sorted((a,b) -> Integer.compare(b, a))
				.collect(Collectors.toList());
		System.out.println(res);
	}
}
