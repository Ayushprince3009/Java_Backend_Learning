package com.kodewala.object.thisCall;

public class User {
	private String userName;
	private String userId;
	private String mobile;
	private String email;
	
	public User(String _userId) {
		this("guest user", _userId, "000000000000", "abc@xyz.com");
		System.out.println("User.User()---1");
	}
	
	public User(String userName, String userId, String mobile, String email) {
		super();
		
		System.out.println("User.User()---2");
		this.userName = userName;
		this.userId = userId;
		this.mobile = mobile;
		this.email = email;
	}
}
