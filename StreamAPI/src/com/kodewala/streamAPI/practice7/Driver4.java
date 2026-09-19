package com.kodewala.streamAPI.practice7;

import java.util.Arrays;
import java.util.List;

public class Driver4 {
	public static void main(String[] args) {
		List<List<String>> categories = Arrays.asList(Arrays.asList("iPhone", "Laptop", "Samsung Phone"),
				Arrays.asList("Smartphone", "OnePlus Phone", "Tablet"),
				Arrays.asList("Google Phone", "iPhone", "Smartwatch"),
				Arrays.asList("Samsung Phone", "Gaming Laptop", "Pixel Phone"));
		
		
		String result = categories.parallelStream()
				.flatMap(cate -> cate.parallelStream())
				.map(name -> name.toUpperCase())
				.distinct()
				.filter(name -> name.contains("PHONE"))
				.sorted()
				.findFirst()
				.get();
		System.out.println(result);
		
	}
	
}
