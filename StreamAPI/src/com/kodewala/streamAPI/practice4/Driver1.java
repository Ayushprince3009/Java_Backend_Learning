package com.kodewala.streamAPI.practice4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver1 {
	public static void main(String[] args) {
		List<Integer> orderIds = Arrays.asList(
			    101, 102, 103, 104, 105
			);
		
		//orderIds.stream().limit(3).forEach(o -> System.out.println(o));
	
		List<Integer> result = orderIds.stream()
				.limit(3)
				.collect(Collectors.toList());
		System.out.println(result);
	
	
	}
}
