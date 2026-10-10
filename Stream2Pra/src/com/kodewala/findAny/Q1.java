package com.kodewala.findAny;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Employee {
    int id;
    String name;
    String department;
    int salary;
    List<String> skills;

    Employee(int id, String name, String department,
             int salary, List<String> skills) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.skills = skills;
    }
}
public class Q1 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Rahul", "IT", 65000,
			        Arrays.asList("Java", "SQL")),
			    new Employee(102, "Priya", "HR", 55000,
			        Arrays.asList("Excel", "Communication")),
			    new Employee(103, "Amit", "IT", 80000,
			        Arrays.asList("Java", "Spring", "Kafka")),
			    new Employee(104, "Neha", "IT", 75000,
			        Arrays.asList("Java", "SQL")),
			    new Employee(105, "Karan", "IT", 90000,
			        Arrays.asList("Spring", "Kafka"))
			);
		Optional<String> result = employees.stream()
				.filter(emp -> emp.department.equalsIgnoreCase("IT") && emp.salary >= 75000)
				.flatMap(emp -> emp.skills.stream())
				.distinct()
				.filter(skill -> skill.equalsIgnoreCase("Kafka"))
				.findAny();
		System.out.println(result);
	}
}
