package com.kodewala.methodoverriding.pq8;

public class Vehicle {
	void drive() {
		System.out.println("Drive");
	}
}

class Car extends Vehicle{
	@Override
	void drive() {
		System.out.println("Car Drive");
	}
}
class SportsCar extends Car{
	@Override
	void drive() {
		System.out.println("SportsCar drive");
	}
}
