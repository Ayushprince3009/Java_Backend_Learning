package com.kodewala.multithrea.practice1;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Main Starts...");
		System.out.println("["+Thread.currentThread().getName()+"]");
		MyThread thread = new MyThread();
		
		System.out.println("Main Ends....");
		
		MyThread thread1 = new MyThread();
		thread1.start();
		thread.start();
	}
}

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("Thread Executed");
		System.out.println("["+Thread.currentThread().getName()+"]");
	}
}