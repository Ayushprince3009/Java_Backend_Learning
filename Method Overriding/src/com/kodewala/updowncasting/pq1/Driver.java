package com.kodewala.updowncasting.pq1;

public class Driver {
	public static void main(String[] args) {
		Animal a = new Dog();
		a.eat();
		
		Dog b = (Dog) a;
		b.bark();
	}
}
