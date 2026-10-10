//package com.kodewala.findFirst;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//class Employee {
//    int id;
//    String name;
//    String department;
//    int salary;
//
//    Employee(int id, String name, String department, int salary) {
//        this.id = id;
//        this.name = name;
//        this.department = department;
//        this.salary = salary;
//    }
//}
//public class Q1 {
//	public static void main(String[] args) {
//		List<Employee> employees = Arrays.asList(
//			    new Employee(101, "Rahul", "IT", 65000),
//			    new Employee(102, "Priya", "HR", 55000),
//			    new Employee(103, "Amit", "IT", 80000),
//			    new Employee(104, "Neha", "IT", 75000),
//			    new Employee(105, "Arjun", "Finance", 70000),
//			    new Employee(106, "Amit", "IT", 90000),
//			    new Employee(107, "Sneha", "IT", 85000),
//			    new Employee(108, "Karan", "HR", 60000)
//			);
//		Optional<String> result = employees.stream()
//				.filter(emp -> emp.department.equalsIgnoreCase("IT") && (emp.salary >= 70000))
//				.sorted((emp1, emp2) -> Integer.compare(emp2.salary, emp1.salary))
//				.map(emp -> emp.name)
//				.distinct()
//				.skip(1)
//				.findFirst();
//		System.out.println(result);
//	}
//}
