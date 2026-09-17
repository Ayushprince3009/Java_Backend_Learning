package com.kodewala.methodoverriding.pq1;

public class Animal {
	void makeSound() {
		System.out.println("Animal's Sound");
	}
}

class Dog extends Animal{
	@Override
	void makeSound() {
		System.out.println("Dog's Sound");
	}
}
