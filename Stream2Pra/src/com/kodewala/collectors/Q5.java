//package com.kodewala.collectors;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//class Employee {
//    int id;
//    String name;
//    String department;
//    String status;
//    int salary;
//    List<String> skills;
//
//    Employee(int id, String name, String department,
//             String status, int salary, List<String> skills) {
//        this.id = id;
//        this.name = name;
//        this.department = department;
//        this.status = status;
//        this.salary = salary;
//        this.skills = skills;
//    }
//}
//public class Q5 {
//	public static void main(String[] args) {
//		List<Employee> employees = Arrays.asList(
//			    new Employee(401, "Amit", "IT", "ACTIVE", 85000,
//			        Arrays.asList("Java", "Spring", "Docker")),
//			    new Employee(402, "Priya", "HR", "ACTIVE", 62000,
//			        Arrays.asList("Recruitment", "Analytics")),
//			    new Employee(403, "Rahul", "IT", "ACTIVE", 95000,
//			        Arrays.asList("Java", "Kafka", "Cloud")),
//			    new Employee(404, "Neha", "Finance", "INACTIVE", 72000,
//			        Arrays.asList("Accounting", "Excel")),
//			    new Employee(405, "Karan", "IT", "ACTIVE", 68000,
//			        Arrays.asList("Spring", "Docker", "AWS")),
//			    new Employee(406, "Sara", "HR", "ACTIVE", 78000,
//			        Arrays.asList("Analytics", "Communication")),
//			    new Employee(407, "Dev", "Finance", "ACTIVE", 88000,
//			        Arrays.asList("Excel", "PowerBI", "SQL")),
//			    new Employee(408, "Isha", "IT", "INACTIVE", 99000,
//			        Arrays.asList("Java", "Cloud")),
//			    new Employee(409, "Meera", "Finance", "ACTIVE", 76000,
//			        Arrays.asList("Accounting", "SQL")),
//			    new Employee(410, "Arjun", "HR", "ACTIVE", 65000,
//			        Arrays.asList("Communication", "Recruitment"))
//			);
//		List<String> res = employees.stream()
//				.filter(emp -> emp.status.equalsIgnoreCase("active") && emp.salary >= 65000)
//				.map(emp -> emp.name)
//				.distinct()
//				.sorted((emp1, emp2) -> emp2.compareTo(emp1))
//				.skip(1)
//				.limit(3)
//				.collect(Collectors.toList());
//		System.out.println(res);
//		
//		long count = employees.stream()
//				.filter(emp -> emp.status.equalsIgnoreCase("active") 
//						&& (emp.department.equalsIgnoreCase("IT")
//						|| emp.department.equalsIgnoreCase("finance"))
//						&& emp.salary > 75000
//						&& emp.id > 401)
//				.collect(Collectors.counting());
//		System.out.println(count);
//		
//		
//		long result = employees.stream()
//				.filter(emp -> emp.status.equalsIgnoreCase("active")
//						&& emp.salary >= 65000)
//				.flatMap(emp -> emp.skills.stream())
//				.filter(skill -> skill.length() >= 5
//				 && (skill.charAt(0) >= 'A' && skill.charAt(0) <= 'S'))
//				.distinct()
//				.sorted()
//				.count();
//		System.out.println(result);
//		
//		List<String> finals = employees.stream()
//				.filter(emp -> emp.status.equalsIgnoreCase("active")
//						&& emp.salary > 70000)
//				.flatMap(emp -> emp.skills.stream())
//				.filter(skill -> skill.contains("a"))
//				.distinct()
//				.sorted()
//				.limit(2)
//				.collect(Collectors.toList());
//		System.out.println(finals);
//		
//		
//	}
//}
