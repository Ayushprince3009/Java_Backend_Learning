package com.kodewala.sortedDesc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q1 {
	public static void main(String[] args) {
		List<List<Integer>> numbers = Arrays.asList(
			    Arrays.asList(42, 15, 78, 23, 42),
			    Arrays.asList(91, 34, 67, 15, 56),
			    Arrays.asList(28, 89, 34, 73, 67),
			    Arrays.asList(50, 91, 45, 23, 82)
			);
		
		List<Integer> res = numbers.stream()
				.flatMap(num -> num.stream())
				.filter(num -> (num > 30))
				.distinct()
				.map(num -> (num*num))
				.sorted((a,b)->Integer.compare(b, a))
				.collect(Collectors.toList());
		System.out.println(res);
	}
}
