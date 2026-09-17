package com.kodewala.inheritance.in;

public class Driver {
	public static void main(String[] args) {
		SavingsAccount acc = new SavingsAccount("SB101","AYUSH",50000,7.987);
		acc.displayDetails();
		CurrentAccount acc1 = new CurrentAccount("SB101","AYUSH",50000,70987);
		acc1.showCurrentAccountDetails();
	}
}
