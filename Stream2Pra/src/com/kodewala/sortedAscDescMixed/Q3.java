package com.kodewala.sortedAscDescMixed;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Transaction {
    int id;
    String type;
    double amount;
    String status;

    Transaction(int id, String type, double amount, String status) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.status = status;
    }

    @Override
    public String toString() {
        return id + " | " + type + " | " + amount + " | " + status;
    }
}

public class Q3 {
	public static void main(String[] args) {
		List<Transaction> transactions = Arrays.asList(
			    new Transaction(1001, "CREDIT", 5000, "SUCCESS"),
			    new Transaction(1002, "DEBIT", 1500, "SUCCESS"),
			    new Transaction(1003, "CREDIT", 8000, "FAILED"),
			    new Transaction(1004, "CREDIT", 12000, "SUCCESS"),
			    new Transaction(1005, "DEBIT", 3000, "SUCCESS"),
			    new Transaction(1006, "CREDIT", 7000, "SUCCESS"),
			    new Transaction(1007, "DEBIT", 1000, "FAILED"),
			    new Transaction(1008, "CREDIT", 6000, "SUCCESS")
			);
		
		List<String> result = transactions.stream()
				.filter(trans -> trans.type.equalsIgnoreCase("credit"))
				.filter(trans -> trans.status.equalsIgnoreCase("SUCCESS"))
				.filter(trans -> trans.amount >= 6000)
				.sorted((t1, t2) -> Double.compare(t2.amount, t1.amount))
				.map(trans -> trans.id +" ---> " +trans.amount)
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
