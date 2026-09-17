package com.kodewala.interfac.pq3;

public class UPIPayment implements PaymentGateway {

	@Override
	public void makePayment() {
		System.out.println("makePayment done");
		
	}

	@Override
	public void checkBalance() {
		System.out.println("Balance checked");
		
	}

	@Override
	public void printPassbook() {
		System.out.println("Passbook Printed");
		
	}

}
