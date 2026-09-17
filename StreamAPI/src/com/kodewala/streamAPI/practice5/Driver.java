package com.kodewala.streamAPI.practice5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {
	public static void main(String[] args) {
		List<String> products = Arrays.asList(
				"Pen", "Notebook", "Eraser", "Backpack",
				"Desk Lamp", "USB Cable", "Stapler",
				"Monitor", "Keyboard", "", "Mouse", "Pad"
				);

			List<String> output = products.stream()
					.filter(str -> str.length() >= 5)
					.collect(Collectors.toList());
			
			System.out.println(output);
	}
}
