package com.kodewala.multithrea.practice4;

public class Driver1 {
	public static void main(String[] args) {
		System.out.println("Main starts...["+Thread.currentThread().getName()+"]");
		Fan f = new Fan();
		Projector p = new Projector(f);
		Thread t1 = new Thread(p);
		t1.start();
		
		Thread t2 = new Thread(p);
		t2.start();
		
		Thread t3 = new Thread(p);
		t3.start();
		
		
		System.out.println("Main ends...["+Thread.currentThread().getName()+"]");
	}
}

class Fan{
	public synchronized void start() {
		System.out.println("Start the fan ["+Thread.currentThread().getName()+"]");
		System.out.println("Slow Down the fan ["+Thread.currentThread().getName()+"]");
	}
}

class Projector implements Runnable{
	
	Fan fan;
	
	public Projector(Fan fan) {
		this.fan = fan;
	}
	
	@Override
	public void run() {
		fan.start();
	}
}