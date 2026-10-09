package com.kodewala.skip;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Transaction {
    int transactionId;
    String customer;
    String type;
    double amount;

    Transaction(int transactionId, String customer,
                String type, double amount) {
        this.transactionId = transactionId;
        this.customer = customer;
        this.type = type;
        this.amount = amount;
    }
}
public class Q1 {
	public static void main(String[] args) {
		List<Transaction> transactions = Arrays.asList(
			    new Transaction(1001, "Rahul", "CREDIT", 5000),
			    new Transaction(1002, "Priya", "DEBIT", 2000),
			    new Transaction(1003, "Rahul", "CREDIT", 8000),
			    new Transaction(1004, "Amit", "CREDIT", 12000),
			    new Transaction(1005, "Rahul", "DEBIT", 1500),
			    new Transaction(1006, "Neha", "CREDIT", 7000),
			    new Transaction(1007, "Rahul", "CREDIT", 10000),
			    new Transaction(1008, "Rahul", "CREDIT", 3000)
			);
		List<String> result = transactions.stream()
				.filter(trans -> trans.customer.equalsIgnoreCase("rahul"))
				.filter(trans -> trans.type.equalsIgnoreCase("credit"))
				.filter(trans -> trans.amount >= 3000)
				.skip(2)
				.limit(2)
				.map(trans -> trans.transactionId+" --> "+trans.amount)
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
