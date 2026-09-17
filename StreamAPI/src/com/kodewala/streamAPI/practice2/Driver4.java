package com.kodewala.streamAPI.practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver4 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ram", "Rahul", "Ayush", "Amit", "Suresh");
		Stream<String> name = names.stream();
		Stream<String> filterName = name.filter(n -> (n.length() > 4));
		Stream<Integer> mapName = filterName.map(n -> n.length());
		List<Integer> output = mapName.collect(Collectors.toList());
		System.out.println(output);
		
		
		
		//oneline
		
		List<Integer> result = names.stream()
				.filter(n -> n.length()>4)
				.map(n -> n.length())
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
