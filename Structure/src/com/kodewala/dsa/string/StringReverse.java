package com.kodewala.dsa.string;

public class StringReverse {
	public static void main(String[] args) {
		String str = "Java";
		
		char[] ch = str.toCharArray();
		
		int start = 0;
		int end = ch.length - 1;
		
		while(start <= end) {
			
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			
			start++;
			end--;
		}
		
//		for(int i=0; i<ch.length; i++) {
//			System.out.println(ch[i]);
//		}
		
		for(char w : ch) {
			System.out.println(w);
		}
	}
}
