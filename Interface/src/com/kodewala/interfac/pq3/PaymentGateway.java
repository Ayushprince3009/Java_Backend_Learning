package com.kodewala.interfac.pq3;

public interface PaymentGateway {
	public abstract void makePayment();
	abstract void checkBalance();
	void printPassbook();
	
	public default void customerSupport() {
		System.out.println("talk to customercare");
	}
	
	public static void companyInfo() {
		System.out.println("Welcome to PayPal");
	}
}
