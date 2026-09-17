package com.kodewala.multithrea.class1;

public class Driver2 {
	public static void main(String[] args) {
		System.out.println("Main Started");
		
		Threadd t1 = new Threadd();
		t1.start();
		Threadd t2 = new Threadd();
		t2.start();	
		
		System.out.println("Main Ends");
	}
}

class Threadd extends Thread{
	@Override
	public void run() {
		System.out.println("Thread started");
		System.out.println("Thread running");
		System.out.println("Thread stopped");
		System.out.println("Thread Name: ["+Thread.currentThread().getName()+"]");
	}
}