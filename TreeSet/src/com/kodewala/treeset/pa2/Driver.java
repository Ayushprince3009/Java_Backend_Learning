package com.kodewala.treeset.pa2;

import java.util.Set;
import java.util.TreeSet;

public class Driver {
	public static void main(String[] args) {
		Set<Employee> emp = new TreeSet<Employee>();
		
		Employee e1 = new Employee(12,"Rohan");
		Employee e2 = new Employee(123,"Rahul");
		Employee e3 = new Employee(234,"Aman");
		Employee e4 = new Employee(4,"Ayush");
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		
		System.out.println(emp.size());
		for(Employee e : emp) {
			System.out.println(e.getId() +" "+e.getName());
		}
	}
} 

class Employee implements Comparable<Employee>{
	private String name;
	private int id;
	
	public Employee(int id,String name) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	@Override
	public int compareTo(Employee o) {
		int result = Integer.compare(this.id, o.id);
		System.out.println(this.id +" "+o.id + " Result: "+result);
		return result;
	}
}                                