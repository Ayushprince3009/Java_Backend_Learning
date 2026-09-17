package com.kodewala.updowncasting.pq4;

public class Driver {
	public static void main(String[] args) {
		BankAccount acc = new SavingAccount();
		acc.deposit();
		acc.withdraw();
		
		SavingAccount kcc  = (SavingAccount) acc;
		kcc.calculateInterest();
	}
}
