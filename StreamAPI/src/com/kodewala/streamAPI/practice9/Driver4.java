package com.kodewala.streamAPI.practice9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver4 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList(
			    "Rahul",
			    "Amit",
			    "Rohan",
			    "Ankit",
			    "Riya",
			    "Aman",
			    "Ravi",
			    "Amit",
			    "Rohan",
			    "Arjun",
			    "Neha",
			    "Nitin"
			);
		
		Map<Character,List<String>> result = names.stream()
				.filter(name -> name.length() > 4)
				.distinct()
				.sorted()
				.skip(2)
				.limit(5)
				.collect(Collectors.groupingBy(name -> name.charAt(0)));
		System.out.println(result);
		
		
	}
}
