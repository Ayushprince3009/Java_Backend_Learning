package com.kodewala.limit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Ticket {
    int ticketId;
    String department;
    String issue;
    int priority;

    Ticket(int ticketId, String department, String issue, int priority) {
        this.ticketId = ticketId;
        this.department = department;
        this.issue = issue;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return ticketId + " | " + department + " | " + issue + " | " + priority;
    }
}

public class Q1 {
	public static void main(String[] args) {
		List<Ticket> tickets = Arrays.asList(
			    new Ticket(101, "IT", "Server Down", 5),
			    new Ticket(102, "HR", "Leave Issue", 3),
			    new Ticket(103, "IT", "Database Error", 4),
			    new Ticket(104, "Finance", "Payment Issue", 5),
			    new Ticket(105, "IT", "Network Failure", 5),
			    new Ticket(106, "IT", "Login Issue", 2),
			    new Ticket(107, "HR", "Payroll Issue", 4),
			    new Ticket(108, "IT", "API Failure", 5)
			);
		
		List<String> result = tickets.stream()
				.filter(tic -> (tic.priority == 5) && (tic.department.equals("IT")))
				.limit(3)
				.map(tic -> tic.ticketId + "------>" + tic.issue)
				.collect(Collectors.toList());
		System.out.println(result);
		
	}
}
