package com.ayush.mtehod.grow;

/*Create an application to understand the behavior of access modifiers (private, default, and public).
Requirements:
	1.	Create a class Employee with:
	•	A private variable and method.
	•	A default variable and method.
	•	A public variable and method.

	2.	Create another class in the same package and try to access all members of Employee.
	3.  Record which members are accessible and which result in compilation errors.*/


public class Employee {
	
	public static double discount = 34.678;
	private static int employeeAge = 56;
	static int time = 29;
	public static void main(String[] args) {
		
		basicSalary(15000);
		timeTaken(2500);
		discountAmount(987.678); 
	}
	
	private static void basicSalary(int salary) {
		System.out.println("Basic Salary:- "+salary);
		System.out.println("Employee Age:- "+Employee.employeeAge);
		System.out.println("Time:- "+Employee.time);
	}
	
	static void timeTaken(int taken) {
		System.out.println("Time Taken:- "+taken);
		System.out.println("Time:- "+Employee.time);
		System.out.println("Employee Age:- "+Employee.employeeAge);
	}
	
	public static void discountAmount(double money) {
		System.out.println("Discount Money:- "+money);
		System.out.println("Discount:- "+Employee.discount);
	}

}
