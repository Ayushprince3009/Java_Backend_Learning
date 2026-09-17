package com.kodewala.streamAPI.practice3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver7 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(
			    10, 20, 30, 40, 50, 60, 70, 80, 90, 100
			);

			List<Integer> num = numbers.stream()
					.skip(3)
					.limit(4)
					.collect(Collectors.toList());
			
			System.out.println(num);
	}
}
