package com.kodewala.encapsulation.bank;

public class Dreiver {
	public static void main(String[] args) {
		BankDetails cust1 = new BankDetails("24346674463", "Ayush", 78964534);
		cust1.displayAccDetails();
		
		cust1.setAccBalance(120467);
		cust1.displayAccDetails();
	}
}
