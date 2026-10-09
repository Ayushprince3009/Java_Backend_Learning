package com.kodewala.skip;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Ticket {
    int ticketId;
    String issue;
    String status;
    int priority;

    Ticket(int ticketId, String issue, String status, int priority) {
        this.ticketId = ticketId;
        this.issue = issue;
        this.status = status;
        this.priority = priority;
    }
}
public class Q3 {
	public static void main(String[] args) {
		List<List<Ticket>> departmentTickets = Arrays.asList(
			    Arrays.asList(
			        new Ticket(301, "Server Down", "OPEN", 5),
			        new Ticket(302, "Login Failure", "CLOSED", 4),
			        new Ticket(303, "Database Error", "OPEN", 5)
			    ),
			    Arrays.asList(
			        new Ticket(304, "API Timeout", "OPEN", 3),
			        new Ticket(305, "Payment Failure", "OPEN", 5),
			        new Ticket(306, "Network Issue", "OPEN", 4)
			    ),
			    Arrays.asList(
			        new Ticket(307, "Email Failure", "OPEN", 5),
			        new Ticket(308, "Slow Response", "CLOSED", 5),
			        new Ticket(309, "Service Crash", "OPEN", 5)
			    )
			);
		
		List<String> result = departmentTickets.stream()
				.flatMap(ticket -> ticket.stream())
				.filter(ticket -> ticket.status.equalsIgnoreCase("OPen") && ticket.priority == 5)
				.skip(2)
				.limit(2)
				.map(ticket -> ticket.ticketId+" --> "+ticket.issue)
				.collect(Collectors.toList());
		System.out.println(result);
				
	}
}
