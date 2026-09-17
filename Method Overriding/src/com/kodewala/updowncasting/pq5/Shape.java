package com.kodewala.updowncasting.pq5;

public class Shape {
	void displayShape() {
		System.out.println("Shape");
	}
}

class Circle extends Shape{
	void calculateArea() {
		System.out.println("Area");
	}
}
