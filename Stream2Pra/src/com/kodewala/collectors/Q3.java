package com.kodewala.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Transaction {
    int id;
    String customer;
    String type;
    String status;
    double amount;
    List<String> tags;

    Transaction(int id, String customer, String type,
                String status, double amount, List<String> tags) {
        this.id = id;
        this.customer = customer;
        this.type = type;
        this.status = status;
        this.amount = amount;
        this.tags = tags;
    }
}
public class Q3 {
	public static void main(String[] args) {
		List<Transaction> transactions = Arrays.asList(
			    new Transaction(201, "Amit", "CREDIT", "SUCCESS", 12000,
			        Arrays.asList("Salary", "Monthly", "Verified")),
			    new Transaction(202, "Priya", "DEBIT", "SUCCESS", 4500,
			        Arrays.asList("Shopping", "Online")),
			    new Transaction(203, "Rahul", "CREDIT", "FAILED", 18000,
			        Arrays.asList("Salary", "Bonus")),
			    new Transaction(204, "Neha", "DEBIT", "SUCCESS", 7500,
			        Arrays.asList("Rent", "Monthly")),
			    new Transaction(205, "Amit", "DEBIT", "SUCCESS", 3200,
			        Arrays.asList("Shopping", "Verified")),
			    new Transaction(206, "Karan", "CREDIT", "SUCCESS", 22000,
			        Arrays.asList("Salary", "Bonus", "Verified")),
			    new Transaction(207, "Priya", "CREDIT", "SUCCESS", 9000,
			        Arrays.asList("Refund", "Online")),
			    new Transaction(208, "Rahul", "DEBIT", "SUCCESS", 6200,
			        Arrays.asList("Shopping", "Monthly")),
			    new Transaction(209, "Neha", "CREDIT", "FAILED", 15000,
			        Arrays.asList("Salary", "Verified")),
			    new Transaction(210, "Karan", "DEBIT", "SUCCESS", 5800,
			        Arrays.asList("Rent", "Online"))
			);
		
		List<String> result = transactions.stream()
				.filter(trans -> trans.status.equalsIgnoreCase("SUCCESS") && trans.amount >= 5000)
				.map(trans -> trans.customer)
				.distinct()
				.sorted((trans1, trans2) -> trans2.compareTo(trans1))
				.skip(2)
				.limit(2)
				.collect(Collectors.toList());
		System.out.println(result);
		
		long count = transactions.stream()
				.filter(trans -> trans.status.equalsIgnoreCase("Success") 
						&& trans.type.equalsIgnoreCase("credit") 
						&& trans.amount > 8000 && trans.id > 201)
				.collect(Collectors.counting());
		System.out.println(count);
						
		long res = transactions.stream()
				.filter(tran -> tran.status.equalsIgnoreCase("success") && tran.amount >= 5000)
				.flatMap(tran -> tran.tags.stream())
				.filter(tran -> tran.length() >= 6)
				.filter(tran -> (tran.charAt(0) >= 'M') && (tran.charAt(0) <= 'V'))
				.distinct()
				.sorted()
				.count();
		System.out.println(res);
		
		
		
	}
}
