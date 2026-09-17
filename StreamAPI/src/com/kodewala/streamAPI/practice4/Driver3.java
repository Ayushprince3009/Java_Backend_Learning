package com.kodewala.streamAPI.practice4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver3 {
	public static void main(String[] args) {
		List<Integer> salaries = Arrays.asList(
			    50000, 70000, 90000, 60000, 90000, 80000
			);
		
		List<Integer> result = salaries.stream()
				.sorted((a,b) -> (b-a))
				.distinct()
				.skip(1)
				.limit(1)
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
