package com.kodewala.interfac.pqq5;

public class SavingAccount implements BankAccount {

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Deposited Rs."+amount+" to your account");
	}

	@Override
	public void withdrawl(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Debited Rs."+amount+" from your Account");
	}

}
