package com.kodewala.streamAPI.practice10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {
	public static void main(String[] args) {
//		List<Double> transactions = Arrays.asList(
//				120.50, 750.00, 45.99, 1023.45, 500.00,
//				89.99, 2100.00, 320.75, 550.00, 15.00,
//				678.90, 445.00, 999.99, 501.00, 2300.50,
//				88.00, 612.34, 399.99, 750.50, 1234.56
//				);
//
//		long result = transactions.parallelStream()
//				.filter(trans -> (trans > 500))
//				.count();
//		
//		System.out.println("Result:- "+result);
		
		
		List<Employee> employees = Arrays.asList(
				new Employee("Alice", "Engineering", 7),
				new Employee("Bob", "Marketing", 2),
				new Employee("Carol", "Data Science", 5),
				new Employee("Dave", "Engineering", 1),
				new Employee("Eve", "Data Science", 8),
				new Employee("Frank", "HR", 4),
				new Employee("Grace", "Engineering", 3),
				new Employee("Hank", "Data Science", 2)
				);
			
		
		List<Employee> result = employees.stream()
				.filter(emp -> (emp.getDepartment().equalsIgnoreCase("Engineering")) || (emp.getDepartment().equalsIgnoreCase("Data Science")))
				.filter(emp -> emp.getYearsOfExperience() > 3)
		        .collect(Collectors.toList());
				
				
		
		System.out.println(result);
		
	}
}


class Employee {
String name; String department; int yearsOfExperience;
Employee(String n, String d, int y) { name=n; department=d; yearsOfExperience=y; }
// getters: getName(), getDepartment(), getYears()
public String getName() {
	return name;
}
public String getDepartment() {
	return department;
}
public int getYearsOfExperience() {
	return yearsOfExperience;
}

		
}
