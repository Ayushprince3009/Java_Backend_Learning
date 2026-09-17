package com.kodewala.interfac.pqq8;

public interface Ride {
	void calculateFare(int distance);
}

class BikeRide implements Ride{

	@Override
	public void calculateFare(int distance) {
		int fare = distance * 8;
		System.out.println("Fare:- "+fare);
	}
}

class MiniCab implements Ride{
	
	
	@Override
	public void calculateFare(int distance) {
		int fare = distance * 12;
		System.out.println("Fare:- "+fare);
	}
}

class Sedan implements Ride{
	
	@Override
	public void calculateFare(int distance) {
		int fare = distance * 18;
		System.out.println("Fare:- "+fare);
	}
}

class SUV implements Ride{


	@Override
	public void calculateFare(int distance) {
		int fare = distance * 25;
		System.out.println("Fare:- "+fare);
	}
}
