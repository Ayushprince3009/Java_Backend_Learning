package com.kodewala.updowncasting.pq5;

public class Driver {
	public static void main(String[] args) {
		Shape s = new Circle();
		s.displayShape();
		
		Circle c = (Circle)s;
		c.calculateArea();
	}
}
