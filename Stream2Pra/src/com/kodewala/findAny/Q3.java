package com.kodewala.findAny;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Transaction {
    int id;
    String status;
    String department;
    int amount;
    List<String> tags;

    Transaction(int id, String status, String department,
                int amount, List<String> tags) {
        this.id = id;
        this.status = status;
        this.department = department;
        this.amount = amount;
        this.tags = tags;
    }
}
public class Q3 {
	public static void main(String[] args) {
		List<Transaction> transactions = Arrays.asList(
			    new Transaction(101, "SUCCESS", "IT", 25000,
			        Arrays.asList("Java", "Backend")),
			    new Transaction(102, "FAILED", "HR", 18000,
			        Arrays.asList("Recruitment", "Payroll")),
			    new Transaction(103, "SUCCESS", "IT", 40000,
			        Arrays.asList("Spring", "Backend")),
			    new Transaction(104, "SUCCESS", "Finance", 12000,
			        Arrays.asList("Accounts", "Audit")),
			    new Transaction(105, "SUCCESS", "IT", 32000,
			        Arrays.asList("Kafka", "Java")),
			    new Transaction(106, "SUCCESS", "IT", 15000,
			        Arrays.asList("Cloud", "Spring"))
			);
		
		Optional<String>result = transactions.stream()
				.filter(trans -> trans.department.equalsIgnoreCase("IT") && trans.amount >= 20000 && trans.status.equalsIgnoreCase("success"))
				.flatMap(trans -> trans.tags.stream())
				.distinct()
				.sorted((trans1, trans2) -> trans2.compareTo(trans1))
				.filter(trans -> trans.length() > 5)
				.findAny();
		System.out.println(result);
	}
}
