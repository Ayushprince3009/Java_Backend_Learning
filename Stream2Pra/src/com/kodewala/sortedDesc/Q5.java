package com.kodewala.sortedDesc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q5 {
	public static void main(String[] args) {
		List<List<Integer>> numbers = Arrays.asList(
			    Arrays.asList(15, 24, 35, 42, 51, 60),
			    Arrays.asList(24, 35, 48, 54, 63, 72),
			    Arrays.asList(30, 42, 51, 66, 75, 84),
			    Arrays.asList(36, 48, 60, 69, 78, 90)
			);
		
		List<Integer> res = numbers.stream()
				.flatMap(num -> num.stream())
				.filter(num -> (num > 30) && (num < 90))
				.filter(num -> (num % 3 == 0))
				.distinct()
				.map(num -> num*num)
				.filter(num -> num > 2500)
				.sorted((a,b) -> Integer.compare(b, a))
				.collect(Collectors.toList());
		System.out.println(res);
	}
}
