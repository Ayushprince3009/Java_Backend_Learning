package com.kodewala.inheritance.start;

public class User extends UserMgmt {
	
	public static void main(String[] args) {
		User user = new User();
		user.doSomething();
		System.out.println(user.location);
		System.out.println(user.type);
	}
}
