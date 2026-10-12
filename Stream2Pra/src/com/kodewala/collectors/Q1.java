package com.kodewala.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    String department;
    String status;
    int salary;
    List<String> skills;

    Employee(int id, String name, String department,
             String status, int salary, List<String> skills) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.status = status;
        this.salary = salary;
        this.skills = skills;
    }
}
public class Q1 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee(1, "Amit", "IT", "ACTIVE", 75000,
			        Arrays.asList("Java", "Spring", "SQL")),
			    new Employee(2, "Priya", "HR", "ACTIVE", 55000,
			        Arrays.asList("Communication", "Recruitment")),
			    new Employee(3, "Rahul", "IT", "ACTIVE", 90000,
			        Arrays.asList("Java", "Kafka", "SQL")),
			    new Employee(4, "Neha", "Finance", "INACTIVE", 65000,
			        Arrays.asList("Excel", "Accounting")),
			    new Employee(5, "Karan", "IT", "ACTIVE", 60000,
			        Arrays.asList("Spring", "Docker")),
			    new Employee(6, "Sara", "HR", "ACTIVE", 70000,
			        Arrays.asList("Recruitment", "Analytics")),
			    new Employee(7, "Dev", "Finance", "ACTIVE", 85000,
			        Arrays.asList("SQL", "Excel", "PowerBI")),
			    new Employee(8, "Isha", "IT", "INACTIVE", 95000,
			        Arrays.asList("Java", "AWS")),
			    new Employee(9, "Meera", "Finance", "ACTIVE", 72000,
			        Arrays.asList("Accounting", "SQL")),
			    new Employee(10, "Arjun", "HR", "ACTIVE", 62000,
			        Arrays.asList("Communication", "Analytics"))
			);
		
		List<String> names = employees.stream()
				.filter(emp -> emp.status.equalsIgnoreCase("active") && emp.salary >= 60000)
				.map(emp -> emp.name)
				.distinct()
				.sorted((emp1, emp2) -> emp2.compareTo(emp1))
				.skip(1)
				.limit(3)
				.collect(Collectors.toList());
		System.out.println(names);
		
		
		long count = employees.stream()
				.filter(emp -> emp.status.equals("ACTIVE") && emp.salary >= 60000)
			
				.collect(Collectors.counting());
		System.out.println(count);
		
		long skillCount =  employees.stream()
				.filter(emp -> emp.status.equals("ACTIVE") && emp.salary >= 60000)
				.flatMap(emp -> emp.skills.stream())
				.distinct()
				.sorted()
				.filter(skill -> skill.length() >= 6 && (skill.charAt(0) >= 'A' && skill.charAt(0) <= 'T'))
				.count();
		System.out.println(skillCount);
	}
}
