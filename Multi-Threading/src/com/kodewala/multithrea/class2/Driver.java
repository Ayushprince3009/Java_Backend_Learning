package com.kodewala.multithrea.class2;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Main Method starts");
		System.out.println("Main thread......."+Thread.currentThread().getName());
		MyEmail t1 = new MyEmail();
		t1.start();
		//t1.start();
	}
}

class MyEmail extends Thread{
	@Override
	public void run() {
		
		System.out.println("Thread is running");
		System.out.println("running...."+ Thread.currentThread().getName());
	}
}
