package com.kodewala.streamAPI.practice4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver9 {
	public static void main(String[] args) {
		List<Employeeeee> employees = Arrays.asList(
			    new Employeeeee("Ayush", 50000, true),
			    new Employeeeee("Rahul", 80000, false),
			    new Employeeeee("Amit", 70000, true),
			    new Employeeeee("Priya", 60000, true),
			    new Employeeeee("Neha", 90000, true)
			);

//		List<String> result = employees.stream()
//				.filter(emp -> emp.getStatus())
//				.sorted((a,b) -> b.getSalary(),a.getSalary())
//				.map(emp -> emp.getName())
//				.limit(2)
//				.collect(Collectors.toList());
				
				
		
		
	}
}

class Employeeeee{
	private String name;
	private int salary;
	private boolean status;
	
	public Employeeeee(String string, int i, boolean b) {
		this.name = string;
		this.salary = i;
		this.status = b;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public boolean getStatus() {
		return status;
	}
	
}