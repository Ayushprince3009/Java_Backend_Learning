package com.kodewala.pr3;

public class Driver1 {
	public static void main(String[] args) {
		Vehicle car = new Car("BMW",120);
		car.start();
		System.out.println(car.getBrand());
		car.getSpeed();
		
		Vehicle bike = new Bike("Honda", 80);
		bike.start();
		bike.getBrand();
		bike.getSpeed();
	}
}

abstract class Vehicle {
	private String brand;
	private int speed;

	public Vehicle(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}

	public String getBrand() {
		return brand;
	}

	public int getSpeed() {
		return speed;
	}

	abstract void start();

	public void displayBrand() {
		System.out.println("");
	}
}

class Car extends Vehicle{
	public Car(String brand, int speed) {
		super(brand, speed);
	}
	
	@Override
	public void start() {
		System.out.println("Car Starts With Keys");
	}
	
	public void displayBrand() {
		System.out.println("Car Brand");
	}
}

class Bike extends Vehicle{

	public Bike(String brand, int speed) {
		super(brand, speed);
	}

	@Override
	void start() {
		System.out.println("Bike Started");
		
	}
	
}