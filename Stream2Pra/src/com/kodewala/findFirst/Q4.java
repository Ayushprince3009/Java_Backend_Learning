package com.kodewala.findFirst;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Employee {
    int id;
    String name;
    String department;
    List<String> skills;
    int experience;

    Employee(int id, String name, String department,
             List<String> skills, int experience) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.skills = skills;
        this.experience = experience;
    }
}
public class Q4 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Rahul", "IT",
			        Arrays.asList("Java", "Spring", "SQL"), 3),
			    new Employee(102, "Priya", "HR",
			        Arrays.asList("Communication", "Excel"), 4),
			    new Employee(103, "Amit", "IT",
			        Arrays.asList("Java", "SQL", "Kafka"), 5),
			    new Employee(104, "Neha", "IT",
			        Arrays.asList("Spring", "Java", "Docker"), 2),
			    new Employee(105, "Karan", "IT",
			        Arrays.asList("SQL", "Redis", "Java"), 4),
			    new Employee(106, "Sneha", "IT",
			        Arrays.asList("Kafka", "Docker", "Spring"), 6),
			    new Employee(107, "Vikas", "Finance",
			        Arrays.asList("Excel", "SQL"), 5)
			);
		
		Optional<String> result = employees.stream()
				.filter(emp -> emp.department.equalsIgnoreCase("IT") && emp.experience >= 3)
				.flatMap(emp -> emp.skills.stream())
				.distinct()
				.sorted()
				.skip(2)
				.findFirst();
		System.out.println(result);
	}
}
