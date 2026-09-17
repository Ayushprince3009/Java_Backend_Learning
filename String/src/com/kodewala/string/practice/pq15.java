//Check whether a string is a palindrome.
package com.kodewala.string.practice;

public class pq15 {
	public static void main(String[] args) {
		String str = "madeam";
		
		char[] arr = str.toCharArray();
		
		int start = 0;
		int last = arr.length -1;
		
		boolean isPalindrome = true;
		while(start < last) {
			if(arr[start] != arr[last]) {
				isPalindrome = false;
				break;
			}
			start++;
			last--;
		}
		if(isPalindrome) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}
}
