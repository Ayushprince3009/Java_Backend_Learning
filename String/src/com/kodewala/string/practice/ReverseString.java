package com.kodewala.string.practice;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Madam";
		
		int len = str.length();
		
		char[] arr = str.toCharArray();
		
		String rev ="";
		for(int i=len-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
