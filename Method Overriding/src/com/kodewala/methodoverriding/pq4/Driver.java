package com.kodewala.methodoverriding.pq4;

public class Driver {
	public static void main(String[] args) {
		Payment p = new UPI();
		p.pay();
	}
}
