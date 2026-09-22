package com.kodewala.exception.practice2;

public class Driver4 {
	public static void main(String[] args) {
		int[] amounts = {1000, 2000, 3000, 4000};
		int index = 2;
		int people = 0;
		
		int amount = amounts[index];
		
		try {
			int perPerson = amount / people;
			System.out.println(perPerson);
		}
		catch(ArithmeticException e) {
			System.out.println("Not Allowed");
			e.printStackTrace();
		}
	}
}
