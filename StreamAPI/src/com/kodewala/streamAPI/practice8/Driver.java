package com.kodewala.streamAPI.practice8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(

	            new Employee("Amit",
	                    Arrays.asList("Java", "SQL", "Spring", "Java")),

	            new Employee("Rahul",
	                    Arrays.asList("Python", "Java", "AWS")),

	            new Employee("Neha",
	                    Arrays.asList("Java", "React", "SQL")),

	            new Employee("Priya",
	                    Arrays.asList("Spring", "Java", "AWS", "SQL"))
	        );
		
		List<String> list = employees.stream()
				.flatMap(emp -> emp.skills.stream())
				.distinct()
				.sorted()
				.skip(2)
				.limit(4)
				.collect(Collectors.toList());
		System.out.println(list);
				
				
	}
}


class Employee {

    String name;
    List<String> skills;

    Employee(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }
}
