package com.kodewala.interfaace.pq1;

public class Driver5 {
	public static void main(String[] args) {
		BankAccount saving = new SavingAccount();
		saving.withdrawl();
		saving.transactionFee();
		
		BankAccount current = new CurrentAccount();
		current.withdrawl();
		current.transactionFee();
		
		BankAccount salary = new SalaryAccount();
		salary.withdrawl();
		salary.transactionFee();
	}
}

interface BankAccount{
	abstract void withdrawl();
	
	default void transactionFee() {
		System.out.println("Transaction fee ₹20.");
	}
}

class SavingAccount implements BankAccount {
	@Override
	public void withdrawl() {
		System.out.println("Withdraw from Saving Account");
	}
}

class CurrentAccount implements BankAccount{
	@Override
	public void withdrawl() {
		System.out.println("Withdraw from Current Account");
	}
	
	@Override
	public void transactionFee() {
		System.out.println("Transaction fee ₹50.");
	}
}

class SalaryAccount implements BankAccount{
	@Override
	public void withdrawl() {
		System.out.println("Withdraw from Salary Account");
	}
	
	@Override
	public void transactionFee() {
		System.out.println("Transaction fee ₹0.");
	}
}