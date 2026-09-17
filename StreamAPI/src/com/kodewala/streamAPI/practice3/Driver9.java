package com.kodewala.streamAPI.practice3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver9 {
	public static void main(String[] args) {
		List<List<String>> names = Arrays.asList(
			    Arrays.asList("Ram", "Rahul"),
			    Arrays.asList("Ayush", "Amit"),
			    Arrays.asList("Rohit", "Vikas")
			);
		
		List<String> res = names.stream()
				.flatMap(n -> n.stream())
				.collect(Collectors.toList());
		System.out.println(res);
		
	}
}
