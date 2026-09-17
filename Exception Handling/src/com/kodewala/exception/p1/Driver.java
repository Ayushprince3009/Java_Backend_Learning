package com.kodewala.exception.p1;

public class Driver {
	public static void main(String[] args) {
		String name = null;
		System.out.println("Program starts..........");
		Driver driver = new Driver();
		driver.something();
		System.out.println(name.length());
		System.out.println("Program ends......");
	}
	
	private  void something() {
		System.out.println("DO Something");
		System.out.println("Processed");
		System.out.println("Ends");
	}
}
