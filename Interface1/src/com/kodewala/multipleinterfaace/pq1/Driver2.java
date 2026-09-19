package com.kodewala.multipleinterfaace.pq1;

public class Driver2 {
	public static void main(String[] args) {
		UPIPayment upi = new PaymentGateway();
		upi.transactionStatus();
		
	}
}

interface UPIPayment{
	default void transactionStatus() {
		System.out.println("UPI transaction Successful");
	}
}

interface BankPayment{
	default void transactionStatus() {
		System.out.println("Bank transaction Successful");
	}
}

class PaymentGateway implements UPIPayment, BankPayment{

	@Override
	public void transactionStatus() {
		//System.out.println("Transaction Done");
		BankPayment.super.transactionStatus();
	}
}