package com.kodewala.collection.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver1 {
	public static void main(String[] args) {
		Customer c1 = new Customer(1001, "Purushotham");
		Customer c2 = new Customer(100, "Ritesh");
		Customer c3 = new Customer(1200, "Rohit");
		Customer c4 = new Customer(99, "Anurag");
		Customer c5 = new Customer(1030, "Parvej");

		List<Customer> customers = new ArrayList<Customer>();

		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		customers.add(c4);
		customers.add(c5);

		Collections.sort(customers, new CustomerByNameComparator());

		for (int i = 0; i < customers.size(); i++) {
			Customer c = customers.get(i);
			System.out.println(c.customerId + " , " + c.customerName);
		}
	}

}
