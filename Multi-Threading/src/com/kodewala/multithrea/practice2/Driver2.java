package com.kodewala.multithrea.practice2;

public class Driver2 {
	public static void main(String[] args) {
		System.out.println("Main Starts..["+Thread.currentThread().getName()+"]");
		System.out.println("Line-2.......");
		Test test = new Test();
		Thread t1 = new Thread(test);
		t1.setName("Thread-1");
		t1.start();
		Thread t2 = new Thread(test);
		t2.setName("Thread-2");
		t2.start();
		System.out.println("Main Endssss....["+Thread.currentThread().getName()+"]");
	}
}

class Test implements Runnable{

	@Override
	public void run() {
		System.out.println("["+Thread.currentThread().getName()+"]");
		System.out.println("Task.run()");
		for(int i=0; i<10; i++) {
			if(i == 5) {
				try {
					System.out.println("Sleeping...");
					Thread.sleep(5000);
					System.out.println("Sleeping time over.... woke up....");
				}
				catch (InterruptedException e) {
					System.out.println("Exception Occured");
					e.printStackTrace();
				}
			}
			System.out.println("Number:-"+i+" "+"["+Thread.currentThread().getName()+"]");
		}
	}
	
}