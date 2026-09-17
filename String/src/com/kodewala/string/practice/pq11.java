package com.kodewala.string.practice;

public class pq11 {
	public static void main(String[] args) {
		String str = "ayush34@jasfhk423";
		
		int countDigit = 0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= '0' && ch <= '9') {
				countDigit++;
			}
		}
		System.out.println(countDigit);
		
	}
}
