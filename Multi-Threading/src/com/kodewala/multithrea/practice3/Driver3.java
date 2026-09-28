package com.kodewala.multithrea.practice3;

public class Driver3 {
	public static void main(String[] args) {
		System.out.println("Main start... ["+Thread.currentThread().getName()+"]");
		SumTask st = new SumTask();
		SumRunnable sr = new SumRunnable(st);
		Thread t1 = new Thread(sr);
		t1.start();
	
		Thread t2 = new Thread(sr);
		t2.start();
		
		Thread t3 = new Thread(sr);
		t3.start();
	    System.out.println("Main endsss.....");
	}
}

class SumTask{
	public synchronized void sum() {
		int num = 0;
		int sum = 0;
		while(num <= 100) {
			sum += num;
			num++;
		}
		System.out.println("s");
		System.out.println("u");
		System.out.println("m");
		System.out.println("Sum:- "+sum+" ["+Thread.currentThread().getName()+"]");
	}
}

class SumRunnable implements Runnable{
	 SumTask sumTask;
	 
	 public SumRunnable(SumTask sumTask) {
		 this.sumTask = sumTask;
	 }
	 
	 @Override
	 public void run() {
		 sumTask.sum();
	 }
}