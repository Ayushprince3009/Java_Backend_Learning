package com.kodewala.abstraction.practice1;

public class Driver {
	public static void main(String[] args) {
		Employee e1 = new Manager("Ayush",50000);
		//System.out.println("Manager Bonus:- "+e1.calculateBonus());
		e1.calculateBonus();
		
		Employee e2 = new Developer("Aditya", 40000);
		e2.calculateBonus();
	}
}

abstract class Employee {
	private String name;
	private double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	abstract double calculateBonus();
}

class Manager extends Employee {

	public Manager(String name, double salary) {
		super(name, salary);
	}

	@Override
	public double calculateBonus() {
		double bonus = (getSalary() * 20) / 100.0;
		System.out.println("Bonus Manager:- "+bonus);
		return bonus;
	}
}

class Developer extends Employee {

	public Developer(String name, double salary) {
		super(name, salary);
	}
	
	@Override
	public double calculateBonus() {
		double bonus = (getSalary() * 10) / 100.0;
		System.out.println("Bonus Developer:- "+bonus);
		return bonus;
	}
}
