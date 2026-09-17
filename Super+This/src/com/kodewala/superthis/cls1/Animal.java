package com.kodewala.superthis.cls1;

public class Animal{
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

class Dog extends Animal{
	private String breed;
	
	public Dog(String name, String breed) {
		super(name);
		this.breed = breed;
	}
	
	public void displayDetails() {
		System.out.println(breed);
		System.out.println(getName());
	}
}

