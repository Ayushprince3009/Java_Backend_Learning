package com.kodewala.encapsulation.bankAccount;

public class Driver {
	public static void main(String[] args) {
		BankAccount user1 = new BankAccount();
		user1.setPin("4678");
		user1.setBalance(5000);
		user1.displayDetails();
		user1.depositAmount("4678", 200);
		user1.withdrawAmount("4678", 3000);
		
	}
}
