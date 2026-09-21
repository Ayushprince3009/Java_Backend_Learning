package com.kodewala.exception.practice1;

public class Driver1 {
	public static void main(String[] args) {
		String str = "ayush kumar";
		//String str = "";
		//String str = null;
		System.out.println("Main Starts");
		System.out.println(str.length());
	
		
		Driver1 driver = new Driver1();
		driver.doSomething();
		System.out.println("Ayush Kumar");
		System.out.println("Main Ends");
	}
	
	
	private void doSomething() {
		System.out.println("Something Doing.......");
		System.out.println("Something Doing.......");
		String name = null;
		System.out.println(name.length());
		System.out.println("Something Doing.......");
		System.out.println("Something Doing.......");
	}
}

// in this code for 1st one we will get the output 
//for second one we will get output as 0 
//for third one we will get exception null pointer exception 

//code will run till it don't get exception as it get's exception it will throw 


