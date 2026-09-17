package com.kodewala.inheritance.animal;

public class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("Animal is eating");
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
	
	void bark() {
		System.out.println("Dog is barking");
	}
	
	void displayDetails() {
		System.out.println("Name:- "+getName());
		System.out.println("Breed:- "+breed);
		super.eat();
		bark();
	}
}
