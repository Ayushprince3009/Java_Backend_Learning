package com.kodewala.multithrea.practice6;

public class Driver2 {
	public static void main(String[] args) {
		
		System.out.println("Main Start...");
		Thread t1 = new Thread(() -> {
			try {
				System.out.println("A");
				Thread.sleep(2000);
				System.out.println("B");
			}
			catch(InterruptedException e) {}
		});
		
		Thread t2 = new Thread(() -> {
			try {
				System.out.println("C");
				Thread.sleep(1000);
				System.out.println("D");
			}
			catch(InterruptedException e) {}
		});
		
		System.out.println("Main ends...");
		
		t1.start();
		t2.start();
	}
}
