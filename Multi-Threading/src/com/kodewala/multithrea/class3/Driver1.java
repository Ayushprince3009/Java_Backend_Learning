package com.kodewala.multithrea.class3;

public class Driver1 {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		Task1 task = new Task1();
		Thread t1 = new Thread(task);
		t1.start();
		System.out.println("Main Ends");
	}
}

class Task1 implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread is running");
		for(int i=0; i<10; i++) {
			if(i == 5) {
				try {
					System.out.println("Sleeping.....");
					Thread.sleep(5000);
					System.out.println("Sleeping time Over....");
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Printing...."+i);
		}
	}
}
