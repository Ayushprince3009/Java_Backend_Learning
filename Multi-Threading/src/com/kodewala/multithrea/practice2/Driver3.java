package com.kodewala.multithrea.practice2;

public class Driver3 {
	public static void main(String[] args) {
		Bike bike = new Bike();
		Taxi t1 = new Taxi(bike);
		t1.start();
		
		Taxi t2 = new Taxi(bike);
		t2.start(); 
	}
}

class Bike{
	public synchronized void Test() {
		for(int i=0; i<10; i++) {
			System.out.println("Current Number:-"+i+"["+Thread.currentThread().getName()+"]");
		}
	}
}

class Taxi extends Thread{
	Bike bike;
	
	Taxi(Bike _bike){
		this.bike = _bike;
	}
	
	
	@Override
	public void run() {
		System.out.println("running...");
		
		bike.Test();
		
	}
}