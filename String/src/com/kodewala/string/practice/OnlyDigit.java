package com.kodewala.string.practice;

public class OnlyDigit {
	public static void main(String[] args) {
		String str ="asafdf12ds56gfhf434576er";
		
		char[] arr = str.toCharArray();
		
		for(char s : arr) {
//			if(s >= '0' && s <= '9') {
//				System.out.println(s);
//			}
			
			if((s>='a' && s<='z') || (s>='A' && s<='Z')) {
				System.out.println(s);
			}
		}
	}
}
