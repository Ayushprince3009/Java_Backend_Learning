//package com.kodewala.multithrea.class1;
//
//public class Driver4 {
//	public static void main(String[] args) {
//		System.out.println("Main Starts");
//		
//		MyThread t1 = new MyThread();
//		t1.start();
//		System.out.println("t1");
//		MyThread t2 = new MyThread();
//		t2.start();
//		System.out.println("t2");
//		
//		MyThread t3 = new MyThread();
//		t3.start();
//		System.out.println("t3");
//		
//		MyThread t4 = new MyThread();
//		t4.start();
//		System.out.println("t4");
//		
//		MyThread t5 = new MyThread();
//		t5.start();
//		System.out.println("t5");
//		
//		System.out.println("Main Ends");
//	}
//}
//
//class MyThread extends Thread{
//	@Override
//	public void run() {
//		System.out.println("Executing Task");
//	}
//}