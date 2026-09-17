package com.kodewala.streamAPI.practice5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver9 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Alice", 30, "alice@example.com"),
				new Person("Bob", 25, "bob@example.org"), new Person("Charlie", 35, "charlie@example.net"),
				new Person("Diana", 28, "diana@example.com"), new Person("Eve", 40, "eve@example.org"));
		
		List<String> email = people.stream()
				.map(peo -> peo.getEmail())
				.collect(Collectors.toList());
		System.out.println(email);
		
		List<String> res = people.stream()
				.map(Person :: getEmail)
				.collect(Collectors.toList());
		System.out.println(res);
	
	
	
	}
}

class Person {
	String name;
	int age;
	String email;

	Person(String n, int a, String e) {
		name = n;
		age = a;
		email = e;
	}

	public String getEmail() {
		return email;
	}
}