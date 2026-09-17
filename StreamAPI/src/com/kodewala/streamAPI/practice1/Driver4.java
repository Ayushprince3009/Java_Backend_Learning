package com.kodewala.streamAPI.practice1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver4 {
	public static void main(String[] args) {
		List<List<String>> city = Arrays.asList(
				Arrays.asList("Bengaluru","Delhi","Mumbai","Chennai"),
				Arrays.asList("Noida","Gurugram","Kochi"),
				Arrays.asList("Patna","Lucknow"),
				Arrays.asList("Hydrabad"));
		
		System.out.println(city);
		
		List<String> cityS = city.stream()
				.flatMap(list -> list.stream())
				.filter(cityR -> cityR.contains("a"))
				.map(n -> n.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(cityS);
		
		
	}
}
