package com.kodewala.treeset.pa4;

import java.util.Set;
import java.util.TreeSet;

public class Driver {
	public static void main(String[] args) {
		Set<Employee> employee = new TreeSet<Employee>();
		
		Employee e1 = new Employee(101, "Ayush", "IT");
		Employee e2 = new Employee(102, "Rahul", "HR");
		Employee e3 = new Employee(101, "Aman", "Finance");
		Employee e4 = new Employee(103, "Ravi", "IT");
		Employee e5 = new Employee(102, "Rohan", "HR");
		Employee e6 = new Employee(104, "Ayush", "IT");
		
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		employee.add(e4);
		employee.add(e5);
		employee.add(e6);
		
		System.out.println(employee.size());
		
		for(Employee emp : employee) {
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getDepartment());
		}
	}
}

class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private String department;
	
	public Employee(int id, String name, String department) {
		this.id = id;
		 this.name = name;
		 this.department = department;
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



	@Override
	public int compareTo(Employee o) {
		int res = Integer.compare(this.id, o.id);
		return res;
	}
	
}
