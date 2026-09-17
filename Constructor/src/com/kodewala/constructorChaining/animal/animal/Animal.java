package com.kodewala.constructorChaining.animal.animal;

public class Animal {
	private String type;
	
	public Animal(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}

class Dog extends Animal{
	private String breed;
	
	public Dog(String type,String breed) {
		super(type);
		this.breed = breed;
	}
	
	public void displayDetails() {
		System.out.println("Type:-"+getType());
		System.out.println("Breed:- "+breed);
		System.out.println();
	}
}


