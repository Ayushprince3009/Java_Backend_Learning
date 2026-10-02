package com.kodewala.multithrea.practice5;

public class Driver {
	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().setName("Waiter");
		System.out.println("Waiter took the order...["+Thread.currentThread().getName()+"]");
		Cooking t  = new Cooking();
		t.setName("cook");
		t.start();
		t.join();
		System.out.println("Waiter served the food...["+Thread.currentThread().getName()+"]");
	}
}

class Cooking extends Thread{
	
	@Override
	public void run() {
		System.out.println("Food is being prepared.....["+Thread.currentThread().getName()+"]");
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Food is prepared.....["+Thread.currentThread().getName()+"]");
	}
}