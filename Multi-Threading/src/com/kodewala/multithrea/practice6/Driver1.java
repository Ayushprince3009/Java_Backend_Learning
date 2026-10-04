package com.kodewala.multithrea.practice6;

public class Driver1 {
	public static void main(String[] args) {
		
		System.out.println("Main starts....");
		
		System.out.println("1");
		
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("2");
		
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("3");
		
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("4");
		
		System.out.println("Main endss....");
	}
}
