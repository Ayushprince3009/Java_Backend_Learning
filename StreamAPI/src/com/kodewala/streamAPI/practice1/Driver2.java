package com.kodewala.streamAPI.practice1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver2 {
	public static void main(String[] args) {
		List<Integer> integer = Arrays.asList(1,4,8,3,11,56,76,98);
		//convert to stream
		Stream<Integer> input = integer.stream();
		//filter
		Stream<Integer> filterInput = input.filter(num -> (num>5));
	
		//output or print
		List<Integer> output = filterInput.collect(Collectors.toList());
		System.out.println(output);
		System.out.println(output.size());
		
		//one line
		List<Integer> out = integer.stream()
				.filter(num -> (num % 2 == 0))
				.collect(Collectors.toList());
		System.out.println(out);
		System.out.println(out.size());
		System.out.println(out.contains(8));
		System.out.println(out);
	}
}
