package com.kodewala.reduce1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private int salary;
    private boolean active;

    public Employee(String name, String department, int salary, boolean active) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.active = active;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public int getSalary() { return salary; }
    public boolean isActive() { return active; }
}

public class Q1 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee("Amit", "IT", 60000, true),
			    new Employee("Neha", "HR", 45000, true),
			    new Employee("Rahul", "IT", 75000, true),
			    new Employee("Priya", "Finance", 55000, false),
			    new Employee("Karan", "IT", 65000, true),
			    new Employee("Sneha", "HR", 50000, false)
			);
		
		//pipeline1
		int totalItSalary = employees.stream()
				.filter(emp -> emp.isActive() && emp.getDepartment().equalsIgnoreCase("IT"))
				.map(emp -> emp.getSalary())
				.reduce(0, (a,b) -> a+b);
		System.out.println(totalItSalary);
		
		//pipeline2
		long eligibleEmployeeCount = employees.stream()
				.filter(emp -> emp.isActive() && emp.getSalary() > 50000)
				.count();
		System.out.println(eligibleEmployeeCount);
		
		//pipeline3 
		List<String> activeITNames = employees.stream()
				.filter(emp -> emp.isActive())
				.map(emp -> emp.getName())
				.sorted()
				.collect(Collectors.toList());
		System.out.println(activeITNames);
		
		//pipeline4
		List<String> empName = employees.stream()
				.filter(emp -> emp.isActive() && emp.getSalary() > 55000)
				.map(emp -> emp.getName())
				.collect(Collectors.toList());
		System.out.println(empName);
	}
}
