package com.kodewalajenny.q7;

public class Driver {
	public static void main(String[] args) {
		SavingAccount s = new SavingAccount("39839838565","Ayush Kumar",200,7.5);
		s.dispaly();
		s.deposit(5000);
		s.getBalance();
		s.withdraw(10000);
		s.getBalance();
	}
}
