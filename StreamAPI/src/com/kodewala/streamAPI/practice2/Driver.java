package com.kodewala.streamAPI.practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {
	public static void main(String[] args) {
		List<User> users = Arrays.asList(
			    new User("Ayush", true),
			    new User("Rahul", false),
			    new User("Amit", true),
			    new User("Priya", false)
			);
		
//		users.stream().filter(user -> !user.isStatus())
//		.forEach(name -> System.out.println(name.getName()));
		
		Stream<User> userS = users.stream();
		
		Stream<User> userF = userS.filter(u -> u.isStatus());
		
		List<User> result = userF.collect(Collectors.toList());
		System.out.println(result);

	}
}

class User{
	private String name;
	private boolean status;
	
	public User(String name, boolean status) {
		this.name = name;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public boolean isStatus() {
		return status;
	}
	
	
}