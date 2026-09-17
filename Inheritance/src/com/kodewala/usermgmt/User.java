package com.kodewala.usermgmt;

public class User extends UserMgmt {
	public static void main(String[] args) {
		User user = new User();
		
		System.out.println(user.name);
		System.out.println(user.locaton);
		
		user.doSmething();
		
		System.out.println(user.fullName());
	}
}
