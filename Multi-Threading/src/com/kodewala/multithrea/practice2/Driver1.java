package com.kodewala.multithrea.practice2;

public class Driver1 {
	public static void main(String[] args) {
		Car car = new Car();
		car.vehicleInfo();
		Thread t1 = new Thread(car);
		t1.start();
	}
}

class Vehicle{
	public void vehicleInfo() {
		System.out.println("New Vehicle new Model");
	}
}

class Car extends Vehicle implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread is ready");
	}
}