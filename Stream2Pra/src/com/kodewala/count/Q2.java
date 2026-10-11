package com.kodewala.count;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Transaction {
    int id;
    String customer;
    String status;
    double amount;
    List<String> categories;

    Transaction(int id, String customer, String status,
                double amount, List<String> categories) {
        this.id = id;
        this.customer = customer;
        this.status = status;
        this.amount = amount;
        this.categories = categories;
    }
}
public class Q2 {
	public static void main(String[] args) {
		List<Transaction> transactions = Arrays.asList(
			    new Transaction(201, "Amit", "SUCCESS", 12000,
			        Arrays.asList("Electronics", "Fashion")),
			    new Transaction(202, "Priya", "FAILED", 8000,
			        Arrays.asList("Fashion", "Books")),
			    new Transaction(203, "Rahul", "SUCCESS", 25000,
			        Arrays.asList("Electronics", "Books", "Travel")),
			    new Transaction(204, "Amit", "SUCCESS", 18000,
			        Arrays.asList("Books", "Travel")),
			    new Transaction(205, "Neha", "SUCCESS", 9000,
			        Arrays.asList("Fashion", "Beauty")),
			    new Transaction(206, "Priya", "SUCCESS", 22000,
			        Arrays.asList("Electronics", "Beauty", "Travel")),
			    new Transaction(207, "Rahul", "SUCCESS", 15000,
			        Arrays.asList("Fashion", "Books")),
			    new Transaction(208, "Karan", "SUCCESS", 30000,
			        Arrays.asList("Travel", "Electronics", "Beauty"))
			);
		
		List<String> result = transactions.stream()
				.filter(trans -> trans.status.equalsIgnoreCase("SUCCESS") && trans.amount >= 10000)
				.map(cus -> cus.customer)
				.distinct()
				.sorted()
				.skip(2)
				.limit(2)
				.collect(Collectors.toList());
		System.out.println(result);
		
		long count = transactions.stream()
				.filter(trans -> trans.status.equalsIgnoreCase("SUCCESS") && trans.amount >= 10000)
				.flatMap(pro -> pro.categories.stream())
				.distinct()
				.sorted()
				.filter(pro ->  pro.length()>6)
				.count();
		System.out.println(count);
	}
}
