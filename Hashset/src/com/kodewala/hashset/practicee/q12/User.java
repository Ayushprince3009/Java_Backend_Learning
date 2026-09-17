package com.kodewala.hashset.practicee.q12;

public class User {
	private int id;
	private String email;
	private String phone;
	private String name;
	
	public User(int id, String email,String phone,String name) {
		this.id = id;
		this.email = email;
		this.phone = phone;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return this.id + this.email.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		User u = (User) obj;
		return this.id == u.id && this.email.equals(u.email);
	}
}


