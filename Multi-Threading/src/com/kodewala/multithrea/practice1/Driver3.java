package com.kodewala.multithrea.practice1;

public class Driver3 {
	public static void main(String[] args) {
		System.out.println("Main Starts...");
		
		System.out.println("["+Thread.currentThread().getName()+"]");
		Bank sbi = new Bank();
		Thread t1 = new Thread(sbi);
		t1.start();
		Thread t2 = new Thread(sbi);
		t2.start();
		
		System.out.println("Main Endsss.....");
	}
}

class Bank implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread start running");
		System.out.println("["+Thread.currentThread().getName()+"]");
		System.out.println("Thread task completed");
	}
}