package com.kodewala.forEach;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private List<String> skills;
	public Employee(int id, String name, String department, double salary, List<String> skills) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.skills = skills;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public double getSalary() {
		return salary;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	
	
	
    // Constructor, getters and setters
    
    
}
public class Q1 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Amit", "IT", 65000,
			        Arrays.asList("Java", "Spring", "SQL")),
			    new Employee(102, "Neha", "HR", 42000,
			        Arrays.asList("Excel", "Communication")),
			    new Employee(103, "Rahul", "IT", 78000,
			        Arrays.asList("Java", "Spring Boot", "SQL")),
			    new Employee(104, "Priya", "Finance", 55000,
			        Arrays.asList("Excel", "SQL")),
			    new Employee(105, "Karan", "IT", 48000,
			        Arrays.asList("Java", "SQL", "Docker")),
			    new Employee(106, "Sneha", "IT", 72000,
			        Arrays.asList("Spring", "Java", "Docker")),
			    new Employee(107, "Vikas", "HR", 52000,
			        Arrays.asList("Excel", "SQL"))
			);
		List<String> eligibleNames = employees.stream()
				.filter(emp -> emp.getSalary() >= 60000 && emp.getDepartment().equalsIgnoreCase("IT"))
				.map(emp -> emp.getName())
				.collect(Collectors.toList());
		System.out.println(eligibleNames);
		
		long eligibleEmployeeCount = employees.stream()
				.filter(emp -> emp.getDepartment().equalsIgnoreCase("IT") && emp.getSalary() > 50000)
				.count();
		System.out.println(eligibleEmployeeCount);
		
		List<String> distinctSkills = employees.stream()
				.filter(emp -> emp.getDepartment().equalsIgnoreCase("IT"))
				.flatMap(emp -> emp.getSkills().stream())
				.distinct()
				.collect(Collectors.toList());
		System.out.println(distinctSkills);
		
		
		employees.stream()
		.filter(emp -> emp.getSalary() >= 50000)
		.forEach(emp -> System.out.println(emp.getName() + " ---- "+ emp.getSalary()));
				
	}
}
