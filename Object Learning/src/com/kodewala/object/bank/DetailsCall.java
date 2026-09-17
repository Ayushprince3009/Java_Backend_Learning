package com.kodewala.object.bank;

public class DetailsCall {

	public static void main(String[] args) {
		Bank obj = new Bank();
		obj.balance = 25000;
		obj.accType = "Saving";
		obj.bankName = "State Bank Of India";
		obj.yearOfOperation = 2024;
		
		obj.customerDetails();
		
		obj.bankBalance();
	}

}
