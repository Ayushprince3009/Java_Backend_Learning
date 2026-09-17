package com.kodewala.pr1;

public class Driver {
	public static void main(String[] args) {
		PaymentSystem pay = new Upi();
		pay.doTrxn();
		pay.txnSuspend();
		pay.txnOnHold();
		
		PaymentSystem pay1 = new Card();
		pay1.doTrxn();
		pay1.txnOnHold();
		pay1.txnSuspend();
	}
}
