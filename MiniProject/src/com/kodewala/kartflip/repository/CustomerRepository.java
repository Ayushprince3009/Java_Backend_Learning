package com.kodewala.kartflip.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//imported this to access the customer data 
import com.kodewala.kartflip.model.Customer;


public class CustomerRepository {
	private Map<String, Customer> customers = new HashMap<String, Customer>();
	
	
	//adding customer
	public void addCustomer(String customerId, Customer customer) {
		customers.put(customerId, customer);
	}
	
	//removing customer
	public void removeCustomer(String customerId) {
		customers.remove(customerId);
	}
	
	//searching customer
	public Customer getCustomerById(String customerId) {
		return customers.get(customerId);
	}
	
	//view all Customer
	public Collection<Customer> viewAll() {
		return customers.values();
	}
}
