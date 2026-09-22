package com.kodewala.exception.practice2;

public class Driver2 {
	public static void main(String[] args) {
		String quantity = "25items";
		
		try {
			int quantityy = (Integer.parseInt(quantity));
			System.out.println(quantityy);
		}
		catch(NumberFormatException e) {
			System.out.println("Cannot convert a String to Integer which contains other than int value");
			e.printStackTrace();
		}
		
	}
}
