package com.kodewala.multithrea.practice1;

public class Driver4 {
	public static void main(String[] args) {
		System.out.println("Main starts");
		System.out.println("["+Thread.currentThread().getName()+"]");
		Run run = new Run();
		Thread t1 = new Thread(run);
		t1.start();
		Thread t2 = new Thread(run);
		t2.start();
		System.out.println("Main endss");
	}
}

class Run implements Runnable{

	@Override
	public void run() {
		System.out.println("run starts ");
		System.out.println("["+Thread.currentThread().getName()+"]");
		for(int i=0; i<10; i++) {
			System.out.println("current:-"+i+" ["+Thread.currentThread().getName()+"]");
		}
		
		
	}
	
}