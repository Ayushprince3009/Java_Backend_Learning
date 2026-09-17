package com.kodewala.hashset.practicee.q12;
import java.util.*;
public class Driver {
	public static void main(String[] args) {
		Set<User> user = new HashSet<User>();
		User u1 = new User(101, "a@gmail.com", "9999", "Ayush");
		User u2 = new User(101, "a@gmail.com", "8888", "Rahul");
		User u3 = new User(101, "b@gmail.com", "7777", "Aman");
		User u4 = new User(102, "a@gmail.com", "6666", "Ayush");
		User u5 = new User(101, "b@gmail.com", "5555", "Rahul");
		User u6 = new User(102, "a@gmail.com", "4444", "Neha");
		
		user.add(u1);
		user.add(u2);
		user.add(u3);
		user.add(u4);
		user.add(u5);
		user.add(u6);
		
		System.out.println(user.size());
	}
}
