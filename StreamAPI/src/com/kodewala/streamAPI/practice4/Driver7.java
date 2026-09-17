package com.kodewala.streamAPI.practice4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver7 {
	public static void main(String[] args) {
		List<Employe> employees = Arrays.asList(
			    new Employe("Ayush", 50000),
			    new Employe("Rahul", 60000),
			    new Employe("Amit", 70000),
			    new Employe("Ankit", 55000),
			    new Employe("Priya", 80000)
			);
		
		List<String> result = employees.stream()
				.filter(emp -> emp.getName().startsWith("A"))
				.map(emp -> emp.getName())
				.collect(Collectors.toList());
		
		System.out.println(result);
		
		employees.stream().filter(emp -> emp.getName().startsWith("A"))
		.map(emp -> emp.getName()).forEach(n -> System.out.println(n));
		
		

	}
}

class Employe{
	private String name;
	private int salary;
	
	public Employe(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
}