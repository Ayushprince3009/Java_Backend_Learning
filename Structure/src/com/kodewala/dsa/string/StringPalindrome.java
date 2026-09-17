package com.kodewala.dsa.string;

public class StringPalindrome {
	public static void main(String[] args) {
		String word = "madam";
		char[] arr = word.toCharArray();
		int i = 0;
		int j = arr.length-1;
		
		while(i<j) {
			if(arr[i] != arr[j]) {
				System.out.println("Not Palindrome");
				return;
			}
			i++;
			j--;	
		}
		System.out.println("Palindrome");
	}
}
