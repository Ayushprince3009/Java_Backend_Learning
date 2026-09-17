package com.kodewala.inheritance.q2;

public class Vehicle {
	private String brand;
	private double price;
	
	public Vehicle(String brand,double price) {
		this.brand = brand;
		this.price = price;
	}
	void start() {
		System.out.println("Vehicle Started");
	}
	void stop() {
		System.out.println("Vehicle stopped");
	}
	public String getBrand() {
		return brand;
	}
	public double getPrice() {
		return price;
	}
}

class Car extends Vehicle{
	private String fuelType;
	
	public Car(String brand,double price,String fuelType) {
		super(brand,price);
		this.fuelType = fuelType;
	}
	void drive() {
		System.out.println("Vehicle is driving");
	}
	
	void displayDetails() {
		System.out.println("Brand: "+getBrand());
		System.out.println("Price: "+getPrice());
		System.out.println("Fuel: "+fuelType);
		start();
		drive();
		stop();
		System.out.println();
	}
}