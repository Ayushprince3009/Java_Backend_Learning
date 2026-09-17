package com.kodewala.updowncasting.pq2;

public class Vehicle {
	void start() {
		System.out.println("Car started");
	}
}

class Car extends Vehicle{
	void openSunRoof() {
		System.out.println("Sun Roof Opened");
	}
}
