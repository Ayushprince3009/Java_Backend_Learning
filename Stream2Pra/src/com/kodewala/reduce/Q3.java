package com.kodewala.reduce;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Transaction {
    private int transactionId;
    private String accountHolder;
    private String type;
    private String status;
    private double amount;

    public Transaction(int transactionId, String accountHolder,
                       String type, String status, double amount) {
        this.transactionId = transactionId;
        this.accountHolder = accountHolder;
        this.type = type;
        this.status = status;
        this.amount = amount;
    }

    public int getTransactionId() { return transactionId; }
    public String getAccountHolder() { return accountHolder; }
    public String getType() { return type; }
    public String getStatus() { return status; }
    public double getAmount() { return amount; }
}
public class Q3 {
	public static void main(String[] args) {
		List<Transaction> transactions = Arrays.asList(
			    new Transaction(101, "Amit", "CREDIT", "SUCCESS", 25000),
			    new Transaction(102, "Neha", "DEBIT", "SUCCESS", 8000),
			    new Transaction(103, "Amit", "DEBIT", "FAILED", 5000),
			    new Transaction(104, "Priya", "CREDIT", "SUCCESS", 40000),
			    new Transaction(105, "Neha", "CREDIT", "SUCCESS", 12000),
			    new Transaction(106, "Amit", "CREDIT", "SUCCESS", 15000),
			    new Transaction(107, "Priya", "DEBIT", "SUCCESS", 10000),
			    new Transaction(108, "Neha", "DEBIT", "FAILED", 3000)
			);
		//1st pipeline
		double totalCreditAmount = transactions.stream()
				.filter(trans -> trans.getType().equalsIgnoreCase("credit")
						&& trans.getStatus().equalsIgnoreCase("success"))
				.map(trans -> trans.getAmount())
				.reduce(0.0, (a,b) -> a+b);
		System.out.println(totalCreditAmount);
		
		//2nd pipeline
		long eligibleResult = transactions.stream()
				.filter(trans -> trans.getStatus().equalsIgnoreCase("success"))
				.filter(trans -> trans.getAmount() >= 10000)
				.count();
		System.out.println(eligibleResult);
		
		//3rd pipeline
		List<String> result = transactions.stream()
				.filter(trans -> trans.getStatus().equalsIgnoreCase("success")
						&& trans.getType().equalsIgnoreCase("credit"))
				.map(trans -> trans.getAccountHolder())
				.distinct().sorted()
				.collect(Collectors.toList());
		System.out.println(result);
		
		//4th pipeline

		
		
		
		
	}
}
