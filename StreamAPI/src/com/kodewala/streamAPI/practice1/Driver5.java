/*
 * 1.	Given a list of integers,
 *  use filter() to find all numbers greater than 50.
 */

package com.kodewala.streamAPI.practice1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver5 {
	public static void main(String[] args) {
		List<Integer> integer = Arrays.asList(12,56,2,34,11,232,111,87,89,90,456,67,71,83,96,69,59,45);
		//convert to stream
		Stream<Integer> integerStream = integer.stream();
		
		//filter
		Stream<Integer> filterInteger = integerStream.filter(num -> (num > 50));
		
		//convert to list
		List<Integer> output = filterInteger.collect(Collectors.toList()); 
		
		//print
		System.out.println(output);
		
		
		//oneLine
		List<Integer> result = integer.stream()
				.filter(num -> (num > 50))
				.collect(Collectors.toList());
		
		System.out.println(result);
		System.out.println(result.size());
	
	
	}
}
