//Print every character using charAt().
package com.kodewala.string.Stringbuilder;

public class Q4 {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("AYUSH KUMAR");
		
		int len = str.length();
		
		for(int i=0; i<len; i++) {
			System.out.println("Character at "+i+" ="+str.charAt(i));
		}
	}

}
