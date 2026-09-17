package com.kodewalajenny.q7;

public class SavingAccount extends Account{
	private double interestRate;

	public SavingAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
		super(accountNumber, accountHolderName, balance);
		this.interestRate = interestRate;
	}
	
	double calculateInterest() {
		double interest = getBalance()*(interestRate/100);
		return interest;
	}
	
	void dispaly() {
		System.out.println("Account Number: "+getAccountNumber());
		System.out.println("Account Owner Name: "+getAccountHolderName());
		System.out.println("Balance: "+getBalance());
		System.out.println("InterestRate: "+interestRate);
		System.out.println("Interest Amount: "+calculateInterest());
	}
}
