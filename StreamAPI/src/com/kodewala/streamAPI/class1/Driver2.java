package com.kodewala.streamAPI.class1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver2 {
	public static void main(String[] args) {
		List<List<String>> cities = 
				Arrays.asList(Arrays.asList("Bangalore","Chennai"),
				Arrays.asList("Mumbai","Delhi","Goa"),
				Arrays.asList("Noida","Gurgaon","Hydrabad"));
		
		System.out.println(cities);
		System.out.println(cities.size());
		
		
		//converting 2-D to 1-D
		
		List<String> output = cities.stream()
				.flatMap(list -> list.stream())
				.filter(w -> w.endsWith("i"))
				.map(w -> w.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(output);
		System.out.println(output.size());
	}
}
