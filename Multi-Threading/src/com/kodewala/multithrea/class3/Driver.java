package com.kodewala.multithrea.class3;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		Task task = new Task();
		Thread t1 = new Thread(task);
		t1.start();
		System.out.println("Main Ends");
	}
}

class Task implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread is running");
	}
}
