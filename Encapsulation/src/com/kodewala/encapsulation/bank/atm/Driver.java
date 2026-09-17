package com.kodewala.encapsulation.bank.atm;

public class Driver {
	public static void main(String[] args) {
		ATM user = new ATM(5000,"3456");
		user.getBalance();
		user.deposit(4000, "3456");
		user.withdraw(200,"3456");
	}
}
