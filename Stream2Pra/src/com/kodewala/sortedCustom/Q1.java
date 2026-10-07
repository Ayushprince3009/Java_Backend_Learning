package com.kodewala.sortedCustom;

import java.util.Arrays;
import java.util.List;

class Employee {
    int id;
    String name;
    String department;
    double rating;
    int salary;

    Employee(int id, String name, String department, double rating, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.rating = rating;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + department +
               " | " + rating + " | " + salary;
    }
}

public class Q1 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Rahul", "IT", 4.5, 75000),
			    new Employee(102, "Priya", "HR", 4.2, 65000),
			    new Employee(103, "Amit", "IT", 4.8, 90000),
			    new Employee(104, "Neha", "Finance", 4.6, 85000),
			    new Employee(105, "Arjun", "IT", 4.8, 80000),
			    new Employee(106, "Sneha", "IT", 4.1, 70000),
			    new Employee(107, "Karan", "HR", 4.7, 72000)
			);
	}
}
