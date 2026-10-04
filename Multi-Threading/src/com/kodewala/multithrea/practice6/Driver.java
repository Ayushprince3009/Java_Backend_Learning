package com.kodewala.multithrea.practice6;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Main Starts...");
		System.out.println("A");
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
		System.out.println("B");
		System.out.println("Main ends...");
	}
}
