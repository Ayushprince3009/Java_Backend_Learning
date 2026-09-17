//Print characters in reverse using `toCharArray()

package com.kodewala.string.practice;

public class Reverse {

	public static void main(String[] args) {
		String str = "AYUSH";
		
		char[] arr = str.toCharArray();
		
		for(char s:arr) {
			System.out.print(s+" ");
		}
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}

	}

}
