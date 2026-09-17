package com.kodewala.pr3;

public class Driver {
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.eat();
		dog.sound();
		
		Animal cat = new Cat();
		cat.eat();
		cat.sound();
	}
}

abstract class Animal{
	public abstract void sound();
	public void eat() {
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal{
	@Override
	public void sound() {
		System.out.println("Dog Barks Bhaw-Bhaw");
	}
}

class Cat extends Animal{
	@Override
	public void sound() {
		System.out.println("Cat Mewos");
	}

	
}