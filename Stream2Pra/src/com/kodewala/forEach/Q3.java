package com.kodewala.forEach;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Transaction {
    private int transactionId;
    private String accountHolder;
    private String type;
    private String status;
    private double amount;
    private List<String> channels;

    public Transaction(int transactionId, String accountHolder,
                       String type, String status, double amount,
                       List<String> channels) {
        this.transactionId = transactionId;
        this.accountHolder = accountHolder;
        this.type = type;
        this.status = status;
        this.amount = amount;
        this.channels = channels;
    }

    public int getTransactionId() { return transactionId; }
    public String getAccountHolder() { return accountHolder; }
    public String getType() { return type; }
    public String getStatus() { return status; }
    public double getAmount() { return amount; }
    public List<String> getChannels() { return channels; }
}
public class Q3 {
	public static void main(String[] args) {
		List<Transaction> transactions = Arrays.asList(
			    new Transaction(101, "Amit", "CREDIT", "SUCCESS", 75000,
			        Arrays.asList("MOBILE", "UPI", "BANK")),
			    new Transaction(102, "Neha", "DEBIT", "SUCCESS", 12000,
			        Arrays.asList("CARD", "POS")),
			    new Transaction(103, "Rahul", "CREDIT", "FAILED", 90000,
			        Arrays.asList("BANK", "UPI")),
			    new Transaction(104, "Priya", "DEBIT", "SUCCESS", 55000,
			        Arrays.asList("MOBILE", "UPI")),
			    new Transaction(105, "Amit", "DEBIT", "SUCCESS", 8000,
			        Arrays.asList("UPI", "MOBILE")),
			    new Transaction(106, "Neha", "CREDIT", "SUCCESS", 40000,
			        Arrays.asList("BANK", "MOBILE")),
			    new Transaction(107, "Rahul", "DEBIT", "SUCCESS", 65000,
			        Arrays.asList("CARD", "ATM")),
			    new Transaction(108, "Priya", "CREDIT", "PENDING", 25000,
			        Arrays.asList("UPI", "BANK"))
			);
		
		List<String> highValueCreditHolders = transactions.stream()
				.filter(trans -> trans.getType().equalsIgnoreCase("credit")
						&& trans.getStatus().equalsIgnoreCase("success")
						&& trans.getAmount() >= 40000)
				.map(trans -> trans.getAccountHolder())
				.distinct()
				.collect(Collectors.toList());
		System.out.println(highValueCreditHolders);
		
		//2nd pipeline
		long successfulDebitCount = transactions.stream()
				.filter(trans -> trans.getType().equalsIgnoreCase("debit")
				&& trans.getStatus().equalsIgnoreCase("success")
						&& trans.getAmount() > 10000)
				.count();
		System.out.println(successfulDebitCount);
		
		//3rd pipeline
		List<String> distinctSuccessfulChannels = transactions.stream()
				.filter(trans -> trans.getStatus().equalsIgnoreCase("success"))
				.flatMap(trans -> trans.getChannels().stream())
				.distinct()
				.collect(Collectors.toList());
		System.out.println(distinctSuccessfulChannels);
		
		//4th pipeline
		transactions.stream()
		.filter(trans -> trans.getStatus().equalsIgnoreCase("success")
				&& trans.getAmount() >= 50000)
		.forEach(trans -> System.out.println(trans.getAccountHolder()+ " - "+trans.getType()+ " - "+trans.getAmount()));
		
		
		
		
		
	}
}
