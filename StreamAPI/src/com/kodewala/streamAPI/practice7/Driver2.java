package com.kodewala.streamAPI.practice7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver2 {
	public static void main(String[] args) {
		List<List<String>> subjects = Arrays.asList(
			    Arrays.asList("Java", "SQL", "HTML"),
			    Arrays.asList("Java", "Spring", "MongoDB"),
			    Arrays.asList("Python", "SQL", "React"),
			    Arrays.asList("Spring", "Docker", "Java")
			);
		List<String> result = subjects.stream()
				.flatMap(sub -> sub.stream())
				.distinct()
				.sorted()
				.skip(2)
				.limit(5)
				.collect(Collectors.toList());
		
		System.out.println(result);
	}
	
}
