package com.kodewala.overloading.q4;

public class Bank {
	public int withdraw(int amount) {
		return amount;
	}

	public void withdraw(int amount, String atmPin) {
		System.out.println(amount);
		System.out.println(atmPin);
	}

	public void withdraw(int amount, String atmPin, boolean otpVerified) {
		System.out.println(amount);
		System.out.println(atmPin);
		System.out.println(otpVerified);
	}
}
