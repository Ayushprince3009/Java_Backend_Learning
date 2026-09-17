package com.kodewala.hashset.practicee.q5;

import java.util.HashSet;
import java.util.Set;

class Employee{
	String name;
	
	public Employee(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
}
public class Driver {
	public static void main(String[] args) {
		Set<Employee> employee = new HashSet<Employee>();
		Employee e1 = new Employee("Kodewala");
		Employee e2 = new Employee("Kodewala");
		
		employee.add(e1);
		employee.add(e2);
		
		System.out.println(employee);
		System.out.println("e1: "+e1.hashCode()+" e2: "+e2.hashCode());
	}
	
}
