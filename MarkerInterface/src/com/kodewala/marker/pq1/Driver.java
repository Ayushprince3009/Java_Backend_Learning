package com.kodewala.marker.pq1;

public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1 = new Employee("Ayush","Sarjapura");
		System.out.println(e1.getName());
		System.out.println(e1.getLocation());
		
		Employee e2 =(Employee) e1.clone();
		System.out.println();
		System.out.println(e2.getName());
		System.out.println(e2.getLocation());
		
		// cloning done both get the same details 
		
		 GoldUser gold = new GoldUser();
		 
		 if(e1 instanceof User) {
			 System.out.println("Yes");
		 }
		 else {
			 System.out.println("No");
		 }
		
	}
}
