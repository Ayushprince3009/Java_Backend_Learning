package com.kodewala.streamAPI.practice1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver3 {
	public static void main(String[] args) {
		List<String> names = 
				Arrays.asList("Rahul","Tiwari","Ritesh","Chauhan","Abhishek","Kushwaha","Ayush","Singh");
		//convert to stream
		Stream<String> input = names.stream();
		//filter
		Stream<String> filterInput = input.filter(name -> name.contains("sh"));
		//map
		Stream<String> mapInput = filterInput.map(item -> item.toUpperCase());
		//print
		List<String> output = mapInput.collect(Collectors.toList());
		System.out.println(output);
		
		//one line
		List<String> out = names.stream()
				.filter(name -> name.contains("sh"))
				.map(item -> item.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(out);
	}
}
