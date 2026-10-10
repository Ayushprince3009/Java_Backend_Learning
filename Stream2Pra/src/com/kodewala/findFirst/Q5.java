package com.kodewala.findFirst;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Transaction {
    int transactionId;
    String customer;
    String status;
    List<String> items;
    int amount;

    Transaction(int transactionId, String customer, String status,
                List<String> items, int amount) {
        this.transactionId = transactionId;
        this.customer = customer;
        this.status = status;
        this.items = items;
        this.amount = amount;
    }
}
public class Q5 {
	public static void main(String[] args) {
		List<Transaction> transactions = Arrays.asList(
			    new Transaction(101, "Rahul", "SUCCESS",
			        Arrays.asList("Laptop", "Mouse"), 70000),
			    new Transaction(102, "Priya", "FAILED",
			        Arrays.asList("Phone", "Charger"), 20000),
			    new Transaction(103, "Amit", "SUCCESS",
			        Arrays.asList("Keyboard", "Mouse"), 5000),
			    new Transaction(104, "Neha", "SUCCESS",
			        Arrays.asList("Monitor", "Laptop"), 30000),
			    new Transaction(105, "Karan", "SUCCESS",
			        Arrays.asList("Phone", "Headphones"), 25000),
			    new Transaction(106, "Sneha", "SUCCESS",
			        Arrays.asList("Keyboard", "Monitor"), 15000),
			    new Transaction(107, "Vikas", "SUCCESS",
			        Arrays.asList("Mouse", "Webcam"), 8000)
			);
		Optional<String> result = transactions.stream()
				.filter(trans -> trans.status.equalsIgnoreCase("success") && trans.amount >= 10000)
				.flatMap(trans -> trans.items.stream())
				.distinct()
				.sorted((item1, item2) -> item2.compareTo(item1))
				.skip(2)
				.findFirst();
		System.out.println(result);	
	}
}
