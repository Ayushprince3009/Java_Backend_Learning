package com.kodewala.streamAPI.practice6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {
	public static void main(String[] args) {
		List<String> numberStrings = Arrays.asList(
				"42", "17", "256", "3", "891", "0",
				"1024", "55", "7", "333", "8192"
				);
		
		List<Integer> result = numberStrings.stream()
				.map(str -> Integer.parseInt(str))
				.collect(Collectors.toList());
		System.out.println(result);
		
		List<Integer> output = numberStrings.stream()
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		System.out.println(output);
		
	}
}
