package com.kodewala.methodoverriding.pq2;

public class Driver {
	public static void main(String[] args) {
		Vehicle v = new Bike();
		v.start();
		Vehicle v1 = (Vehicle) new Bike();
		v1.start();
	}
}
