package com.kodewala.interfac.pq3;

public class Driver {
	public static void main(String[] args) {
		PaymentGateway.companyInfo();
		UPIPayment upi = new UPIPayment();
		upi.makePayment();
		upi.checkBalance();
		upi.printPassbook();
		
	}
}
