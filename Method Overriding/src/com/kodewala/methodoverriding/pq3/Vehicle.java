package com.kodewala.methodoverriding.pq3;

public class Vehicle {
	void start() {
		System.out.println("started");
	}
}
class Bike extends Vehicle{
	@Override
	void start() {
		System.out.println("Bike Starts");
	}
}


