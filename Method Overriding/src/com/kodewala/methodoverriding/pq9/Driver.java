package com.kodewala.methodoverriding.pq9;

public class Driver {
	public static void main(String[] args) {
		Person p = new Surgeon();
		p.displayRole();
		
		Surgeon s = (Surgeon) p;
		s.displayRole();
		s.displaySalary();
		
		Doctor d = (Doctor)p;
		d.displayRole();
		
		
	}
}
