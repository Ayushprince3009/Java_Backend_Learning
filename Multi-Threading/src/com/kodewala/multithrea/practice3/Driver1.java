package com.kodewala.multithrea.practice3;

public class Driver1 {
	public static void main(String[] args) {
		WelcomeTask w = new WelcomeTask();
		WelcomeRunnable wr = new WelcomeRunnable(w);
		Thread t1 = new Thread(wr);
		t1.start();
		
		WelcomeRunnable wt = new WelcomeRunnable(w);
		Thread t2 = new Thread(wt);
		t2.start();
	}
}

class WelcomeTask{
	public synchronized void task() {
		System.out.println("Welcome To Java MultiThreading");
		//System.out.println(" ["+Thread.currentThread().getName()+"]");
	}
}

class WelcomeRunnable implements Runnable{
	WelcomeTask welcome;
	
	public WelcomeRunnable(WelcomeTask _welcome) {
		this.welcome = _welcome;
	}
	
	@Override
	public void run() {
		for(int i=1; i<6; i++) {
			welcome.task();
		}
		System.out.println(" ["+Thread.currentThread().getName()+"]");
	}
}