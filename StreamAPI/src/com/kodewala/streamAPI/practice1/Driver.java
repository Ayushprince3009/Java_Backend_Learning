package com.kodewala.streamAPI.practice1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {
	public static void main(String[] args) {
		List <String> name = Arrays.asList("Aman","Ayush","Atul","Suresh","Nischita","Ritesh","Priya","Shyam");
		//convert to stream
		Stream<String> names = name.stream();
		
		//now we will filter 
		Stream<String> namesFiltered = names.filter(n -> n.startsWith("A"));
		
		//printing
		List<String> output = namesFiltered.collect(Collectors.toList());
		System.out.println(output);
		
		// oneLine
		
		List<String> output1 = name.stream()
				.filter(n -> n.startsWith("A"))
				.collect(Collectors.toList());
		
		System.out.println(output1);
	
	}
}
