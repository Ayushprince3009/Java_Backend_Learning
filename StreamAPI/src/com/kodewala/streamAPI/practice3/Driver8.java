package com.kodewala.streamAPI.practice3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver8 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(
			    10, 25, 35, 42, 55, 60, 75
			);
		
	int res =	numbers.stream()
				.filter(n -> n > 40)
				.findFirst()
				.get();
				
		System.out.println(res);
	}
} 
