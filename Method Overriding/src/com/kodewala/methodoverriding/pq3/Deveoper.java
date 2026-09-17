package com.kodewala.methodoverriding.pq3;

public class Deveoper {
	public static void main(String[] args) {
		Employee e = new Developer();
		e.work();
		System.out.println();
		
		Developer d = (Developer)e;
		d.work();
	}
}

