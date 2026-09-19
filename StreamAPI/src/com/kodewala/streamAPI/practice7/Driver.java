package com.kodewala.streamAPI.practice7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {
	public static void main(String[] args) {
		List<String> employees = Arrays.asList(
			    "Ayush", "Rahul", "Amit", "Priya", "Ayush",
			    "Rohit", "Neha", "Aditya", "Rohan", "Priya"
			);
		
		List<String> list = employees.stream().filter(emp -> emp.length() >= 5)
				.map(empName -> empName.toUpperCase()).distinct()
				.sorted().skip(2).limit(3).collect(Collectors.toList());
		System.out.println(list);
		
	}
}
