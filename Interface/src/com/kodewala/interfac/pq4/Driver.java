package com.kodewala.interfac.pq4;

class Employee implements Cloneable {
	String name;
	String location;

	public Employee(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1 = new Employee("Ayush","Bangalore");
		
		Employee e2 = (Employee)e1.clone();
		System.out.println(e2.name+" "+e2.location);
	}
}
