package com.kodewala.oops.encapsulation.atm;

public class Driver {
	public static void main(String[] args) {
		ATM atm = new ATM();
		
		//atm.deposit("1234", 5000);
		System.out.println(atm.getBalance());
		atm.withdraw("1234", 500);
	}
}
