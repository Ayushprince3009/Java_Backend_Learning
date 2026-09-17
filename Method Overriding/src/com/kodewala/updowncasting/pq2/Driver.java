package com.kodewala.updowncasting.pq2;

public class Driver {
	public static void main(String[] args) {
		Vehicle v = new Car();
		v.start();
		
		Car c = (Car) v;
		c.openSunRoof();
	}
}
