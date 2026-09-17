package com.kodewala.methodoverriding.pq6;

public class Driver {
	public static void main(String[] args) {
		Payment p = new UPI();
		p.pay();
		
		UPI s = (UPI) p;
		s.pay();
	}
}
