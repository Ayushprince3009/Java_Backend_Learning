package com.kodewala.interfaace.pq1;

public class Driver2 {
	public static void main(String[] args) {
		Vehicle car = new Car();
		car.start();
		car.stop();
		
		Vehicle bike = new Bike();
		bike.start();
		bike.stop();
	}
}

interface Vehicle{
	abstract void start();
	
	default void stop() {
		System.out.println("Vehicle stopped");
	}
}

class Car implements Vehicle{
	@Override
	public void start() {
		System.out.println("Car Started");
	}
	
	@Override
	public void stop() {
		System.out.println("Car Stopped");
	}
}

class Bike implements Vehicle{
	@Override
	public void start() {
		System.out.println("Bike started");
	}
}