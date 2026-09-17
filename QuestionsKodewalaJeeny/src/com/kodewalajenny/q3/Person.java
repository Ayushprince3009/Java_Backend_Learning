package com.kodewalajenny.q3;

public class Person {
	private String name;
	private int age;
	private String gender;
	
	public Person(String name, int  age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	
	public void dispayDetails() {
		System.out.println("Name:- "+name);
		System.out.println("Age:- "+age);
		System.out.println("Gender:- "+gender);
		System.out.println();
	}
}
