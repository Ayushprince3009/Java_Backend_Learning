package com.kodewala.pr3;

public class Driver2 {
	public static void main(String[] args) {
		Employee e1 = new Manager("Ayush",15000);
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		System.out.println(e1.calculateBonus());
		
		System.out.println("-------------");
		
		Employee e2 = new Developer("Ritesh",13000);
		
		System.out.println(e2.getName());
		System.out.println(e2.getSalary());
		System.out.println(e2.calculateBonus());
	
	}
}

abstract class Employee{
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

class Manager extends Employee{
	public Manager(String name, double salary) {
		super(name,salary);
	}
	
	@Override
	public double calculateBonus() {
		double bonus = (getSalary() * (10/100.0));
		return bonus;
	}
}

class Developer extends Employee{
	public Developer(String name, double salary) {
		super(name, salary);
	}

	@Override
	double calculateBonus() {
		double bonus = ((getSalary()) * (10/100.0));
		return bonus;
	}
}