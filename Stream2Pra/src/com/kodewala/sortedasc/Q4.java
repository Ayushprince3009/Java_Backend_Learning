package com.kodewala.sortedasc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q4 {
	public static void main(String[] args) {
		List<List<Integer>> numbers = Arrays.asList(
			    Arrays.asList(45, 12, 78, 23),
			    Arrays.asList(9, 56, 34, 12),
			    Arrays.asList(67, 23, 89, 45)
			);
		
		List<Integer> res = numbers.stream()
				.flatMap(num -> num.stream())
				.distinct()
				.filter(num -> (num > 20))
				.sorted()
				.collect(Collectors.toList());
		System.out.println(res);
	}
}
