package com.kodewala.override;

public class FirstName {
	private String firstName;
	
	public void displayName() {
		System.out.println("Name:-"+firstName);
	}
	
	public String getName() {
		return firstName;
	}
}

class LastName extends FirstName{
	private String lastName;
	public void displayName() {
		System.out.println();
	}
}