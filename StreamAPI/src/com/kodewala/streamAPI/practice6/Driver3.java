package com.kodewala.streamAPI.practice6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver3 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(
			    10, 20, 10, 30, 40, 20, 50, 60, 30, 70
			);
		
		List<Integer> result = nums.stream()
				.filter(num -> num % 2 == 0)
				.distinct()
				.skip(2)
				.limit(3)
				.collect(Collectors.toList());
		System.out.println(result);
		System.out.println(result.size());
		
		long res = nums.stream()
				.distinct()
				.filter(num -> (num % 2 == 0))
				.skip(2)
				.limit(3)
				.count();
		System.out.println(res);
	}
}
