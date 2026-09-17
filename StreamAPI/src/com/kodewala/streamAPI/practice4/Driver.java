package com.kodewala.streamAPI.practice4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {
	public static void main(String[] args) {
		List<String> emails = Arrays.asList(
			    "a@gmail.com",
			    "b@gmail.com",
			    "a@gmail.com",
			    "c@gmail.com",
			    "b@gmail.com"
			);
		
		List<String> result = emails.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(result);
		
		
		//emails.stream().distinct().forEach(n -> System.out.println(n));
	}
}
