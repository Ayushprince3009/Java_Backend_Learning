package com.kodewala.sortedAscDescMixed;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Customer {
    int id;
    String name;
    String city;
    int orders;

    Customer(int id, String name, String city, int orders) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.orders = orders;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + city + " | " + orders;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Customer)) return false;

        Customer c = (Customer) obj;
        return id == c.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}

public class Q5 {
	public static void main(String[] args) {
		List<List<Customer>> regionalCustomers = Arrays.asList(

			    Arrays.asList(
			        new Customer(101, "Rahul", "Delhi", 12),
			        new Customer(102, "Priya", "Mumbai", 8),
			        new Customer(103, "Amit", "Pune", 15)
			    ),

			    Arrays.asList(
			        new Customer(104, "Neha", "Bangalore", 10),
			        new Customer(101, "Rahul", "Delhi", 12),
			        new Customer(105, "Arjun", "Chennai", 6)
			    ),

			    Arrays.asList(
			        new Customer(106, "Sneha", "Mumbai", 20),
			        new Customer(102, "Priya", "Mumbai", 8),
			        new Customer(107, "Karan", "Pune", 14)
			    )
			);
		
		List<String> result = regionalCustomers.stream()
				.flatMap(rc -> rc.stream())
				.distinct()
				.filter(rc -> rc.orders >= 10)
				
				.sorted((a,b) -> Integer.compare(b.orders, a.orders))
				.map(rc -> rc.name +" ----> "+rc.orders)
				.collect(Collectors.toList());
		System.out.println(result);
		
	}
}
