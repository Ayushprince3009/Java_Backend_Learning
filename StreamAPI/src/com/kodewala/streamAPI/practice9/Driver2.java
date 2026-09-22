package com.kodewala.streamAPI.practice9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver2 {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList(
			    "Apple",
			    "Banana",
			    "Avocado",
			    "Mango",
			    "Apricot",
			    "Blueberry",
			    "Apple",
			    "Blackberry",
			    "Mango",
			    "Orange"
			);
		
		Map<Character,List<String>> result = fruits.stream()
				.distinct()
				.sorted()
				.collect(Collectors.groupingBy(name -> name.charAt(0)));
		System.out.println(result);
	}
}
