package com.kodewala.constructorChaining.paymentsystem;

public class Driver {
	public static void main(String[] args) {
		UPIPayment payment = new UPIPayment("Done","PHONEPE45432","ayush980aytm");
		payment.displayDetails();
		UPIPayment payment1 = new UPIPayment("Failed","ASEPE45432","ayush9add80gfsdaytm");
		payment1.displayDetails();
		
	}
}
