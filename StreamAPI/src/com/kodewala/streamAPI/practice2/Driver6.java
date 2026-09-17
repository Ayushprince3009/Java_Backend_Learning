package com.kodewala.streamAPI.practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver6 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList(
			    "Apple", "Banana", "Amazon", "Mango", "Avocado", "Grapes"
			);
		
		
		List<String> result = words.stream()
				.filter(word -> word.startsWith("A"))
				.map(word -> word.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(result);
	}
}
