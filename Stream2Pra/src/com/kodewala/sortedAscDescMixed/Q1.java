package com.kodewala.sortedAscDescMixed;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    String department;
    int salary;

    Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + department + " | " + salary;
    }
}

public class Q1 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Rahul", "IT", 65000),
			    new Employee(102, "Priya", "HR", 55000),
			    new Employee(103, "Amit", "IT", 80000),
			    new Employee(104, "Neha", "Finance", 70000),
			    new Employee(105, "Arjun", "IT", 75000),
			    new Employee(106, "Sneha", "IT", 60000),
			    new Employee(107, "Karan", "HR", 50000),
			    new Employee(108, "Riya", "IT", 70000)
			);
		
		List<String>result = employees.stream()
				.filter(emp -> emp.department.equalsIgnoreCase("IT"))
				.filter(emp -> emp.salary >= 60000)
				.sorted((e1, e2) -> Integer.compare(e2.salary, e1.salary))
				.map(emp -> emp.name)
				.collect(Collectors.toList());
	      
		System.out.println(result);
	}
}
