package com.kodewala.abstraction.practice1;

public class ShapeArea {
	public static void main(String[] args) {
		Shape circle = new Circle(5);
		circle.area();
		
		Shape rectangle = new Rectangle(5,6);
		rectangle.area();
	}
}

abstract class Shape {
	abstract double area();
}

class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double area() {
		double area = 3.14 * getRadius() * getRadius();
		System.out.println("Area of Circle:- " + area);
		return area;
	}
}

class Rectangle extends Shape {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	@Override
	public double area() {
		double area = getLength() * getWidth();
		System.out.println("Area of Rectangle :-" + area);
		return area;
	}
}