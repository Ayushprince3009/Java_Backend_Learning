package com.kodewala.exception.c1;

public class Driver1 {
	public static void main(String[] args) {
		System.out.println("Main driver starts");
		
		try {
		String name = null; 
		System.out.println("Length: "+name.length()); 
		
		
		Driver1 driver1 = new Driver1();
		driver1.doSomething();
		}
		
		catch(NullPointerException e) {
			System.out.println("Exception : Name is null");
			e.printStackTrace();
		}
		
		System.out.println("Driver main ends ");
	}
	
	private void doSomething() {
		System.out.println("Driver doSomething() start here");
		System.out.println("doSoething doing Somethimng");
		System.out.println("doSomething ends here");
		
	}
}