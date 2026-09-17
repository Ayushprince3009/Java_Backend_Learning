package com.kodewala.methodoverriding.pq6;

public class Payment {
	void pay() {
		System.out.println("Paid");
	}
}

class UPI extends Payment{
	void pay() {
		System.out.println("UPI pay");
	}
}
