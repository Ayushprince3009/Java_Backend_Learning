package com.kodewala.streamAPI.practice5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver8 {
	public static void main(String[] args) {
		List<String> categories = Arrays.asList(
				"electronics", "books", "clothing", "home & garden",
				"sports", "toys", "automotive", "health",
				"beauty", "groceries", "office", "music"
				);
		
		List<String> result = categories.stream()
				.map(cat -> cat.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(result);
		
	}
}
