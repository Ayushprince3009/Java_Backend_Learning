package com.kodewala.count;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class SupportTicket {
    int id;
    String agent;
    String status;
    int priority;
    List<String> tags;

    SupportTicket(int id, String agent, String status,
                  int priority, List<String> tags) {
        this.id = id;
        this.agent = agent;
        this.status = status;
        this.priority = priority;
        this.tags = tags;
    }
}
public class Q4 {
	public static void main(String[] args) {
		List<SupportTicket> tickets = Arrays.asList(
			    new SupportTicket(401, "Maya", "CLOSED", 4,
			        Arrays.asList("login", "billing", "urgent")),
			    new SupportTicket(402, "Arjun", "OPEN", 5,
			        Arrays.asList("billing", "refund")),
			    new SupportTicket(403, "Maya", "CLOSED", 5,
			        Arrays.asList("payment", "login", "refund")),
			    new SupportTicket(404, "Sara", "CLOSED", 3,
			        Arrays.asList("account", "security")),
			    new SupportTicket(405, "Dev", "CLOSED", 5,
			        Arrays.asList("security", "payment", "urgent")),
			    new SupportTicket(406, "Arjun", "CLOSED", 4,
			        Arrays.asList("refund", "account")),
			    new SupportTicket(407, "Sara", "OPEN", 5,
			        Arrays.asList("login", "urgent")),
			    new SupportTicket(408, "Isha", "CLOSED", 5,
			        Arrays.asList("billing", "security", "payment"))
			);
		
		List <String> result = tickets.stream()
				.filter(tic -> tic.status.equalsIgnoreCase("closed") && tic.priority >= 4)
				.map(tic -> tic.agent)
				.distinct()
				.sorted()
				.skip(1)
				.limit(2)
				.collect(Collectors.toList());
		System.out.println(result);
		
		long count = tickets.stream()
				.filter(tic -> tic.status.equalsIgnoreCase("closed") && tic.priority >= 4)
				.flatMap(tic -> tic.tags.stream())
				.distinct()
				.sorted()
				.filter(tick -> tick.length() >= 6)
				.count();
		System.out.println(count);
	}
}
