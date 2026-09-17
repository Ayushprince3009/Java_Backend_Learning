package com.kodewala.collection.compare;

import java.util.Comparator;

public class CustomerByNameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		int result = c1.customerName.compareTo(c2.customerName);
		return result;
	}

}
