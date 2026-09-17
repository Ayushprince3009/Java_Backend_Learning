package com.kodewala.streamAPI.practice5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver4 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(
				5, 3, 5, 1, 3, 7, 1, 9, 5, 3,
				2, 8, 2, 7, 1, 4, 6, 5, 3, 9
				);
		
		List<Integer> result = nums.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
