package com.kodewala.string.practice.last;

public class Palindromee {
	public static void main(String[] args) {
		String str = "ayushsuya";
		
		int start = 0;
		int end = str.length() - 1;
		
		while(start < end) {
			if(str.charAt(start) != str.charAt(end)) {
				System.out.println("Not a Palindrome");
				return;
			}
			start++;
			end--;
		}
		System.out.println("Palindrome");
	}
}
