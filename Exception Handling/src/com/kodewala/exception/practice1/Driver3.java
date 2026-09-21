package com.kodewala.exception.practice1;

public class Driver3 {
	public static void main(String[] args) {
		System.out.println("Main Starts..");
		System.out.println("Main is Running......");
		Driver3 driver = new Driver3();
		driver.doSomething();
		
		try {
			int num = 500;
			int res = num/0;
			System.out.println("Result:- "+res);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception Occured");
			e.printStackTrace();
		}
		System.out.println("Main endss.....");
	}
	
	private void doSomething() {
		System.out.println("doSomething() starts......");
		System.out.println("doSomething() is running.....");
		try {
			String name =null;
			System.out.println("String Length:-"+name.length());
		}
		catch(NullPointerException e) {
			System.out.println("Null Pointer Exception Occured");
			e.printStackTrace();
		}
		
		System.out.println("doSomething() ends........");
	}
}
