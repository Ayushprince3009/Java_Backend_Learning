package com.kodewala.multithrea.practice3;

public class Driver {
	public static void main(String[] args) {
		NumberTask nt = new NumberTask();
		NumberRunnable t1 = new NumberRunnable(nt);
		Thread t = new Thread(t1);
		t.start();
		System.out.println("["+Thread.currentThread().getName()+"]");
		
		Thread t2 = new Thread(t1);
		t2.start();
	}
}

class NumberTask {
	public void task(){
		for(int i=0; i<10; i++) {
			System.out.println("Number:-"+i+" ["+Thread.currentThread().getName()+"]");
		}
	}
}

class NumberRunnable implements Runnable{

	NumberTask number;
	
	public NumberRunnable(NumberTask number) {
		this.number = number;
	}
	
	@Override
	public void run() {
		number.task();
		System.out.println("["+Thread.currentThread().getName()+"]");
		number.task();
		System.out.println("["+Thread.currentThread().getName()+"]");
	}
}