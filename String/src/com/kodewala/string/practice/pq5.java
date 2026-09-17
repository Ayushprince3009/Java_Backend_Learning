package com.kodewala.string.practice;

public class pq5 {
	public static void main(String[] args) {
		String str = "Kodewala Academy at BTM";
		System.out.println(str.substring(0,5));
		
		int len = str.length();
		System.out.println(len);
		String lastFour = str.substring(len - 4, len);
		System.out.println(lastFour);
	}
}
