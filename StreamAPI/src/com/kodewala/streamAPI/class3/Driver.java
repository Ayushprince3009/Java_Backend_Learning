package com.kodewala.streamAPI.class3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver {
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Chennai","Mysore","Bangalore","Hydrabad","Gurgaon","Noida",
				"Delhi","Mysore","Mumbai","Jaipur","Surat","Ahmedabad");
	
	long count = cities.stream()
			.collect(Collectors.counting());
	
	System.out.println("Number of Cities:- "+count);
	
	Map<Object,List<String>> res = cities.stream()
			.collect(Collectors.groupingBy(c -> c.length()>5));
	System.out.println(res);
	
	}
}
