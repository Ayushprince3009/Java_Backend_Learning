package com.kodewala.constructorChaining.paymentsystem;

public class PaymentSystem {
	private String status;
	
	public PaymentSystem(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
}

class Payment extends PaymentSystem{
	private String paymentId;
	
	public Payment(String status, String paymentId) {
		super(status);
		this.paymentId = paymentId;
	}
	
	public String getPayment() {
		return paymentId;
	}
}

class UPIPayment extends Payment{
	private String upiId;
	
	public UPIPayment(String status,String paymentId, String upiId) {
		super(status,paymentId);
		this.upiId = upiId;
	}
	
	public void displayDetails() {
		System.out.println("Upi Id:- "+upiId);
		System.out.println("Payment Id:- "+super.getPayment());
		System.out.println("Status::- "+super.getStatus());
		System.out.println();
	}
}
