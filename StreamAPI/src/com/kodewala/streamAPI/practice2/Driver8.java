package com.kodewala.streamAPI.practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver8 {
	public static void main(String[] args) {
		List<List<Integer>> numbers = Arrays.asList(
			    Arrays.asList(10, 20, 30),
			    Arrays.asList(40, 50, 60),
			    Arrays.asList(70, 80, 90)
			);

		List<Integer> result = numbers.stream()
				.flatMap(num -> num.stream())
				.filter(num -> num > 50)
				.map(num -> (num * 10))
				.collect(Collectors.toList());
		System.out.println(result);
		
		
	}
}
