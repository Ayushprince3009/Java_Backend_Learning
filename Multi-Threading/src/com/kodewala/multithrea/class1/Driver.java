//package com.kodewala.multithrea.class1;
//
//public class Driver {
//	public static void main(String[] args) {
//		System.out.println("START main()");
//		
//		System.out.println("This thread is executed by ["+ Thread.currentThread().getName()+ "] thread");
//		System.out.println("Hello World!");
//		System.out.println("My Name Is Ayush...");
//		
//		MyThread t1 = new MyThread();
//		t1.start();
//		MyThread t2 = new MyThread();
//		t2.start();
//		MyThread t3 = new MyThread();
//		t3.start();
//		MyThread t4 = new MyThread();
//		t4.start();
//		MyThread t5 = new MyThread();
//		t5.start();
//		
//		System.out.println("Main Ends");
//	}
//}
//
//class MyThread extends Thread{
//	
//	@Override
//	public void run() {
//		System.out.println("Executing run thread");
//		
//		System.out.println("MyThread : This code is executed by ["+Thread.currentThread().getName()+ "] thread");
//	}
//}
