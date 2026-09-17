package com.kodewala.interfac.pqq7;

public class Driver {
	public static void main(String[] args) {
		Employee e;
		
		e = new Developer();
		e.work();
		
		e = new Manager();
		e.work();
		
		e = new Tester();
		e.work();
	}
}
