package com.kodewala.methodoverriding.pq8;

public class Driver {
	public static void main(String[] args) {
		Vehicle v = new SportsCar();
		v.drive();
		Car c = (Car) v;
		c.drive();
		SportsCar s = (SportsCar)c;
		s.drive();
	}
}
