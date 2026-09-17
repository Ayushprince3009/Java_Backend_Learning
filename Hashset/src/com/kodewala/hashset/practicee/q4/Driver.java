package com.kodewala.hashset.practicee.q4;

public class Driver {
	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Ayush");
		Employee e2 = new Employee(101, "Rahul");
		
		System.out.println(e1.equals(e2));
		
		System.out.println(e1.hashCode() == e2.hashCode());
	}
}

class Employee{
	int id;
	String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		return this.id == e.id;
	}
}