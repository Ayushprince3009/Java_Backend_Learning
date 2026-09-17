package com.kodewala.streamAPI.practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver1 {
	public static void main(String[] args) {
		List<Integer>numbers = Arrays.asList(10,15,20,25,30,35,40);
		//convert to stream 
		Stream<Integer> streamNumber = numbers.stream();
		//filter
		Stream<Integer> filterNumber = streamNumber.filter(n -> !(n % 2 == 0));
		//convert to list
		List<Integer> output = filterNumber.collect(Collectors.toList());
		System.out.println(output);
		
		//one line for even 
		List<Integer> result = numbers.stream()
				.filter(num -> (num % 2 == 0))
				.collect(Collectors.toList());
		
		System.out.println(result);
	}
}
