package com.kodewala.multithrea.class1;

public class Driver1{
	public static void main(String[] args) {
		System.out.println("Main Thread starts");
		
		MyThreadd t1 = new MyThreadd();
		t1.start();
		
		MyThreadd t2 = new MyThreadd();
		t2.start();
		
		
	}
}

class MyThreadd extends Thread{
	@Override
	public void run() {
		System.out.println("Hello from cild thread");
		System.out.println("Executing By: "+Thread.currentThread().getName());
	}
}