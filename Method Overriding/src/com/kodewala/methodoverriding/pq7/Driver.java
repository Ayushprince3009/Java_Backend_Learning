package com.kodewala.methodoverriding.pq7;

public class Driver {
	public static void main(String[] args) {
		Person p = new Employee();
		p.display();
		
		Employee e = (Employee)p;
		e.display();
	}
}
