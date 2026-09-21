package com.kodewala.exception.practice1;

public class Driver2 {
	public static void main(String[] args) {
		System.out.println("Main Starts.......");
		int amount = 100;
		try {
			System.out.println(amount/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception Occured can't divide a number by 0");
			e.printStackTrace();
		}
		System.out.println("Main Endssssss");
		
		
	}
}
