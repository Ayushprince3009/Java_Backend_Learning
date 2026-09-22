package com.kodewala.exception.practice2;

public class Driver3 {
	public static void main(String[] args) {
		String[] prices = {"100", "200", "300", "abc", "500"};

		int index = 3;
		
		try {
			int res = Integer.parseInt(prices[index]);
		}
		catch(NumberFormatException e) {
			System.out.println("cant't do this ");
			e.printStackTrace();
		}
	}
}
