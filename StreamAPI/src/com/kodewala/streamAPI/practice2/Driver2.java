package com.kodewala.streamAPI.practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver2 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("rahul", "ayush", "amit", "rohit");

		Stream<String> name = names.stream();
		
		Stream<String> mapName = name.map(n -> n.toUpperCase());
		
		List<String> output = mapName.collect(Collectors.toList());
		System.out.println(output);
		
		//oneLine
		List<String> result = names.stream()
				.map(n -> n.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(result);
		
				
	}
}
