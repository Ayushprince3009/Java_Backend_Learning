package com.kodewala.dsa.string;

public class Palindrome {
	public static void main(String[] args) {
		String str = "madame";
		
		char[] arr = str.toLowerCase().toCharArray();
		
		int start = 0;
		int end = arr.length-1;
		
		boolean isPalindrome = true;
		while(start < end) {
			if(arr[start] != arr[end]) {
				isPalindrome = false;
				break;
			}
			else {
				start++;
				end--;
			}
		}
		if(isPalindrome) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
