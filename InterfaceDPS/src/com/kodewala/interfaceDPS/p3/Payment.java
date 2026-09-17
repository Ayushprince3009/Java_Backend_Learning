package com.kodewala.interfaceDPS.p3;

interface Payment {
	public abstract void paymentMode();
	
	public default void validatePayment() {
		if() {
			System.out.println("Payment Denied");
		}
		System.out.println("Payment Validated");
	}
	
	default void generateReceipt() {
		System.out.println("Receipt Generated");
	}
}
