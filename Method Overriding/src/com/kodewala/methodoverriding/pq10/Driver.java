package com.kodewala.methodoverriding.pq10;

public class Driver {
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.playMusic();
		
		Vehicle v = new Car();
		v.start();
		
		Car d = (Car)v;
		d.start();
		d.playMusic();
	}
}
