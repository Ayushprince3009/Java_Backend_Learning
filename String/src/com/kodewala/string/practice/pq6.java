package com.kodewala.string.practice;

public class pq6 {
	public static void main(String[] args) {
		String str = "ayushkkumar840@gmail.com";
		System.out.println(str.length());
		int index = str.indexOf("@");
		String reqString = str.substring(index, str.length());
		System.out.println(reqString);
		int indexH = str.indexOf('h');
		System.out.println(indexH);
		
		System.out.println(str.substring(0,5));
	}
}
