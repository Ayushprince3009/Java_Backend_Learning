package com.kodewala.methodoverriding.pq10;

public class Vehicle {
	void start() {
		System.out.println("Vehicle Starts");
	}
}

class Car extends Vehicle {
	@Override
	void start() {
		System.out.println("Car starting");
	}

	void playMusic() {
		System.out.println("PLay MUsic");
	}
}
