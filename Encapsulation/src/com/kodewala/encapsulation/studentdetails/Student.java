package com.kodewala.encapsulation.studentdetails;

public class Student {
	public static void main(String[] args) {
		Details std1 = new Details("AYUSH", 45, 89);
		System.out.println("Student Name:-"+std1.getName());
		System.out.println("Roll Number:- "+std1.getRoll());
		System.out.println("Marks:-"+std1.getMarks());
		
		std1.setName("Aman");
		std1.setRoll(34);
		std1.setMarks(89);
		
		System.out.println("\n\nStudent Name:-"+std1.getName());
		System.out.println("Roll Number:- "+std1.getRoll());
		System.out.println("Marks:-"+std1.getMarks());
		
	}
}
