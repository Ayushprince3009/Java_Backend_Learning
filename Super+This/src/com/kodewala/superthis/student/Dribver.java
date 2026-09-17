package com.kodewala.superthis.student;

public class Dribver {
	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = new Student("Ayush");
		Student std3 = new Student("Ayush", 25);
		
		std1.displayDetails();
		std2.displayDetails();
		std3.displayDetails();
		
	}
}
