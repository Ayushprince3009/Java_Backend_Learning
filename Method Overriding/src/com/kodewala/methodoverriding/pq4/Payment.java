package com.kodewala.methodoverriding.pq4;

public class Payment {
	void pay() {
		System.out.println("Paid");
	}
}

class UPI extends Payment{
	@Override
	void pay() {
		System.out.println("UPI Done");
	}
}
