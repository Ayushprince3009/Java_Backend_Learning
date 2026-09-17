package com.kodewalajenny.q2;

public class Circle {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if(radius < 0) {
			this.radius = 1;
		}else {
			this.radius = radius;
		}
	}
	
	public void circumferenceCircle() {
		double circumference = 2*3.14*radius;
		System.out.println("Circumference:- "+circumference);
	}
	
	public void displayDetails() {
		System.out.println("Radius:- "+radius);
		circumferenceCircle();
	}
	
}
