package com.kodewala.streamAPI.practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver3 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 60, 75, 30, 90, 45);
		//convert this list to stream
		Stream<Integer> number = numbers.stream();
		//filter
		Stream<Integer> filterNumber = number.filter(num -> (num > 50));
		//now map
		Stream<Integer> mapNumber = filterNumber.map(num -> (num*2));
	    //convert to list
		List<Integer> output = mapNumber.collect(Collectors.toList());
		
		System.out.println(output);
		
		//oneLine
		List<Integer> numberss = numbers.stream()
				.filter(num -> (num > 50))
				.map(num -> num*2)
				.collect(Collectors.toList());
		System.out.println(numberss);
	}
}
