package com.kodewala.streamAPI.practice9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver3 {
	public static void main(String[] args) {
		List<Employe> employees = Arrays.asList(
			    new Employe(11, "Raj", "IT", 70000),
			    new Employe(12, "Pooja", "HR", 45000),
			    new Employe(13, "Nikhil", "Finance", 80000),
			    new Employe(14, "Anjali", "IT", 55000),
			    new Employe(15, "Mohit", "HR", 65000),
			    new Employe(16, "Kavya", "Finance", 60000),
			    new Employe(17, "Raj", "IT", 70000),
			    new Employe(18, "Deepak", "IT", 50000)
			);
		
		Map<String,List<Employe>> res = employees.parallelStream()
				.filter(emp -> emp.getSalary() >= 55000)
				.distinct()
				.sorted((a,b) -> Integer.compare(b.getSalary(), a.getSalary()))
				.collect(Collectors.groupingBy(emp -> emp.getDepartment()));
		
		System.out.println(res);
	}
}



class Employe{
	private int num;
	private String name;
	private String department;
	private int salary;
	
	public Employe(int num, String name, String department, int salary) {
		this.num = num;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public int getSalary() {
		return salary;
	}
	
	@Override 
	public String toString() {
		return getName();
	}
	
	
}