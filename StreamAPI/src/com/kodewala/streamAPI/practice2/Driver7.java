package com.kodewala.streamAPI.practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver7 {
	public static void main(String[] args) {
		List<List<Integer>> numbers = Arrays.asList(
			    Arrays.asList(1, 2, 3),
			    Arrays.asList(4, 5),
			    Arrays.asList(6, 7, 8)
			);
		
		List<Integer> result = numbers.stream()
				.flatMap(num -> num.stream())
				.collect(Collectors.toList());
		System.out.println(result);
		
	}
}
