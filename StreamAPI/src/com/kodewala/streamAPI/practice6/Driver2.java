//package com.kodewala.streamAPI.practice6;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class Driver2 {
//	public static void main(String[] args) {
//		List<Employee> employees = Arrays.asList(new Employee("Ayush", 22, 45000), new Employee("Rahul", 25, 60000),
//				new Employee("Amit", 24, 55000), new Employee("Priya", 28, 75000), new Employee("Neha", 30, 90000));
//
//		List<String> result = employees.stream().filter(emp -> emp.getAge() > 23).filter(emp -> emp.getSalary() > 50000)
//				.map(emp -> emp.getName()).skip(1).limit(1).collect(Collectors.toList());
//
//		System.out.println(result);
//	}
//}
//
//class Employee {
//
//	private String name;
//	private int age;
//	private int salary;
//
//	// Constructor
//	public Employee(String name, int age, int salary) {
//		this.name = name;
//		this.age = age;
//		this.salary = salary;
//	}
//
//	// Getter for name
//	public String getName() {
//		return name;
//	}
//
//	// Setter for name
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	// Getter for age
//	public int getAge() {
//		return age;
//	}
//
//	// Setter for age
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	// Getter for salary
//	public int getSalary() {
//		return salary;
//	}
//
//	// Setter for salary
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
//}