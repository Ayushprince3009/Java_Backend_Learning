package com.kodewala.streamAPI.practice6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver5 {
	public static void main(String[] args) {
		List<String> cities = Arrays.asList(
			    "Delhi", "Mumbai", "Delhi",
			    "Bangalore", "Chennai", "Mumbai",
			    "Hyderabad", "Pune", "Chennai"
			);
		
		
		List<String> res = cities.stream()
				.distinct()
				.skip(2)
				.limit(3)
				.collect(Collectors.toList());
		
		System.out.println(res);
		
		long count = cities.stream()
				.distinct()
				.count();
		System.out.println(count);
		
		String cityy = cities.stream().filter(city -> city.startsWith("B"))
		.findFirst().get();
		
		System.out.println(cityy);
	}
}
