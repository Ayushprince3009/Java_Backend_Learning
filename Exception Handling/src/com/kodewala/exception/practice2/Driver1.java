package com.kodewala.exception.practice2;

public class Driver1 {
	public static void main(String[] args) {
		int totalAmount = 5000;
		int people = 0;
		try {
			int perPerson = totalAmount / people;
		}
		catch(ArithmeticException e) {
			System.out.println("Can't Divide a Number by 0");
			e.printStackTrace();
		}
	}
}
