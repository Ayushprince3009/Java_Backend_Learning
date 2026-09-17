package com.kodewala.interfac.pqq8;

public class Driver {
	public static void main(String[] args) {
		Ride ride = new BikeRide();
		ride.calculateFare(12);
		
		Ride ridee = new MiniCab();
		ridee.calculateFare(10);
		
		
		
	}
}
