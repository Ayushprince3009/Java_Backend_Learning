package com.kodewala.exception.c1;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Main driver starts");
		//String name = null ;  //this will give null point exception
		String name = args[0] ; // this will give arrayindexoutofbound exception
		System.out.println("Length: "+name.length());  //here null.length() will be called
		
		
		Driver driver = new Driver();
		driver.doSomething();
		
		System.out.println("Driver main ends ");
	}
	
	private void doSomething() {
		System.out.println("Driver doSomething() start here");
		System.out.println("doSoething doing Somethimng");
		System.out.println("doSomething ends here");
		
	}
}


