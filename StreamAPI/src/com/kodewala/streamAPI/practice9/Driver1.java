package com.kodewala.streamAPI.practice9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver1 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee(1, "Vivek", "IT", 45000),
			    new Employee(2, "Riya", "HR", 30000),
			    new Employee(3, "Kunal", "IT", 60000),
			    new Employee(4, "Sneha", "Finance", 55000),
			    new Employee(5, "Arjun", "HR", 40000),
			    new Employee(6, "Meera", "Finance", 35000)
			);

		Map<String, List<Employee>> result = employees.stream()
				.filter(emp -> emp.getSalary() >= 40000)
				.collect(Collectors.groupingBy(emp -> emp.getDepartment()));
		System.out.println(result);
		
	}
}

class Employee{
	private int serialNumber;
	private String name;
	private String department;
	private int salary;
	
	public Employee(int serialNumber, String name, String department, int salary) {
		this.serialNumber = serialNumber;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public int getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return getName(); 
	}
}