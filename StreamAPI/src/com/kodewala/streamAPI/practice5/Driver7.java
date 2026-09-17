package com.kodewala.streamAPI.practice5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver7 {
	public static void main(String[] args) {
		List<Double> transactions = Arrays.asList(
				120.50, 750.00, 45.99, 1023.45, 500.00,
				89.99, 2100.00, 320.75, 550.00, 15.00,
				678.90, 445.00, 999.99, 501.00, 2300.50,
				88.00, 612.34, 399.99, 750.50, 1234.56
				);
		
		long count = transactions.stream()
				.filter(tran -> (tran > 500))
				.count();
		System.out.println(count);
		
		List<Double> result = transactions.stream()
				.filter(transa -> transa > 500)
				.collect(Collectors.toList())
				;
		System.out.println(result);
		System.out.println(result.size());
	}
}
