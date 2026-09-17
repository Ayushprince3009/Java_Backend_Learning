package com.kodewala.streamAPI.practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver5 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee("Rahul", 80000),
			    new Employee("Ayush", 120000),
			    new Employee("Amit", 60000),
			    new Employee("Rohit", 150000)
			);
		
		Stream<Employee> emp = employees.stream();
		Stream<Employee> filterEmp = emp.filter(emps -> (emps.getSalary() > 100000));
		Stream<String> mapEmp = filterEmp.map(emps -> emps.getName());
		List<String> output = mapEmp.collect(Collectors.toList());
		System.out.println(output);
		
		//oneLine
		List<String> result = employees.stream()
				.filter(empp -> (empp.getSalary() > 100000))
				.map(empp -> empp.getName())
				.collect(Collectors.toList());
		System.out.println(result);
		
		
	}
}

class Employee{
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
}
