package com.kodewala.multithrea.practice1;

public class Driver1 {
	public static void main(String[] args) {
		System.out.println("Main starts...");
		Thread.currentThread().setName("MAINSSSS");
		System.out.println("["+Thread.currentThread().getName()+"]");
		Test t1 = new Test();
		t1.start();
		t1.setName("AYU");
		Test t2 = new Test();
		t2.start();
		t2.setName("SH");
		Test t3 = new Test();
		t3.start();
		t3.setName("PRI");
		System.out.println("Main ends");
	}
}

class Test extends Thread{
	@Override
	public void run() {
		System.out.println("thread started");
		System.out.println("["+Thread.currentThread().getName()+"]");
		System.out.println("Thread ends...");
		
	}
}