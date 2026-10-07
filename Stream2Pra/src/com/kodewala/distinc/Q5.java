package com.kodewala.distinc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q5 {
	public static void main(String[] args) {
		List<List<Integer>> numbers = Arrays.asList(
			    Arrays.asList(10, 15, 20, 25, 30),
			    Arrays.asList(20, 25, 35, 40, 45),
			    Arrays.asList(30, 35, 50, 55, 60),
			    Arrays.asList(40, 45, 65, 70, 75)
			);
		
		List<Integer> res = numbers.stream()
				.flatMap(num -> num.stream())
				.filter(num -> num > 20)
				.filter(num -> num < 70)
				.filter(num -> (num % 5 == 0) || (num % 3 == 0))
				.map(num -> num * num)
				.distinct()
				.collect(Collectors.toList());
		System.out.println(res);
	}
}
