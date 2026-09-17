package com.kodewala.streamAPI.class3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver2 {
	public static void main(String[] args) {
//		String name = "Hello";
//		
//		List<Character> output = name.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
//		System.out.println(output);

		// important question
//		String input = "swiss";
//
//		Map<Character, Long> output = input.chars().mapToObj(c -> (char) c)
//				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		//important first non repeating character
		String input = "swiss";
		Character res = input.chars().mapToObj(c -> (char) c)
		.filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
		.findFirst().get();
		System.out.println(res);
		
		String inputt = "swiss";
		List<Character> ress = input.chars().mapToObj(c -> (char) c)
		.filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
		.collect(Collectors.toList());
		System.out.println(ress);

	}
}
