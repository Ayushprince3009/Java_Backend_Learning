package com.kodewala.streamAPI.practice6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver1 {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		
		Employee e1 =new Employee("Ayush", 50000);
		Employee e2 =new Employee("Rahul", 60000);
		Employee e3 =new Employee("Amit", 50000);
		Employee e4 =new Employee("Priya", 70000);
		Employee e5 =new Employee("Neha", 60000);
		Employee e6 =new Employee("Rohit", 80000);
		Employee e7 =new Employee("Karan", 90000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		
		List<Integer> result = list.stream()
				.filter(emp -> emp.getSalaries() >= 60000)
				.map(emp -> emp.getSalaries())
				.distinct()
				.skip(1)
				.limit(2)
				.collect(Collectors.toList());
		System.out.println(result);
	}
}

class Employee {
	private String name;
	private int salaries;

	public Employee(String name, int salaries) {
		this.name = name;
		this.salaries = salaries;
	}

	public String getName() {
		return name;
	}

	public int getSalaries() {
		return salaries;
	}
}