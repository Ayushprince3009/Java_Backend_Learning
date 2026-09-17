package com.kodewala.interfac.pqq2;

public interface Vehicle {
	public abstract void start();
	void go();
	abstract void stop();
}

class Bike implements Vehicle{

	@Override
	public void start() {
		System.out.println("Bike started");
		
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("go to your location");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
	System.out.println("Stop at signal");
	}
	
}
