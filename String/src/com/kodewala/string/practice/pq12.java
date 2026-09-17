package com.kodewala.string.practice;

public class pq12 {
	public static void main(String[] args) {
		String str = "adghd342$%^hgjah%$^456gjhjhs";
		int Count = 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.toUpperCase().charAt(i);
			if (!((ch >= 'A') && (ch <= 'Z') || (ch > '0') && (ch < '9'))) {
				Count++;
			}
		}
		System.out.println(Count);
	}
}
