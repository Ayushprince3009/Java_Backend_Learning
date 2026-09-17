package com.kodewala.string.practice.last;

public class Palindrome {
	public static void main(String[] args) {
		String str = "ayushsuya";
		
		int start = 0;
		int end = str.length() - 1;
		
		boolean palindrome = true;
		
		while(start < end) {
			if(str.charAt(start) != str.charAt(end)) {
				palindrome = false;
				break;
			}
			start++;
			end--;
		}
		if(!(palindrome)) {
			System.out.println("Not A Palindrome");
		}
		else {
			System.out.println("Palindrome");
		}
	}
}
