package com.kodewala.streamAPI.practice4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver4 {
	public static void main(String[] args) {
		List<Employees> employees = Arrays.asList(
			    new Employees("Ayush", "Bangalore"),
			    new Employees("Rahul", "Delhi"),
			    new Employees("Amit", "Bangalore"),
			    new Employees("Priya", "Mumbai"),
			    new Employees("Neha", "Delhi")
			);

//		List<String> result  = employees.stream()
//				.map(emp -> emp.getCity())
//				.distinct()
//				.collect(Collectors.toList());
//		System.out.println(result);
		
		employees.stream().map(emp -> emp.getCity()).distinct()
		.forEach(emp -> System.out.println(emp));
		
		
		
	}
}

class Employees{
	private String name;
	private String city;
	
	public Employees(String name, String city) {
		this.name = name;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCity() {
		return city;
	}
}