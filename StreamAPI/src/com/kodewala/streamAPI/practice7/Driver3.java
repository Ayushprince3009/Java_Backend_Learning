package com.kodewala.streamAPI.practice7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver3 {
	public static void main(String[] args) {
		List<Integer> salaries = Arrays.asList(
			    25000, 45000, 30000, 55000, 45000,
			    70000, 35000, 60000, 30000, 80000,
			    50000, 65000
			);
		
		List<Integer> result = salaries.parallelStream()
				.distinct()
				.filter(salary -> salary > 30000)
				.sorted()
				.skip(3)
				.limit(5)
				.collect(Collectors.toList());
		
		System.out.println(result);
	}
}
