package com.kodewala.streamAPI.practice7;

import java.util.Arrays;
import java.util.List;

public class Driver1 {
	public static void main(String[] args) {
		List<String> products = Arrays.asList(
			    "Laptop", "Speaker", "Smartphone", "Tablet",
			    "speaker", "Smartwatch", "Monitor", "Shoes",
			    "Smartphone"
			);
		
		String result = products.stream()
				.map(pro -> pro.toLowerCase())
				.distinct()
				.sorted()
				.filter(pro -> pro.startsWith("s"))
				.findFirst()
				.get();
		
		System.out.println(result);
	}
}
