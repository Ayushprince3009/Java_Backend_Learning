package com.kodewala.methodoverriding.pq2;

public class Vehicle {
	void start() {
		System.out.println("Vehicle Start");
	}
}

class Bike extends Vehicle{
	@Override
	void start() {
		System.out.println("Bike Starts");
	}
}
