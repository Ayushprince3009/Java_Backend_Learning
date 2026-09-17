package com.kodewala.string.practice;

public class pq16 {
	public static void main(String[] args) {
		String str = "aYush KuMar pRince KodeWala acAdemy Btm";
		
//		String str1 = str.replace(" ","");
//		System.out.println(str1);
		
		String str1 = str.replace(" ","");
		
		int upperCase = 0;
		int lowerCase = 0;
		for(int i=0; i<=str1.length()-1; i++) {
			if((str1.charAt(i) >= 'A') && (str1.charAt(i) <= 'Z')) {
				upperCase++;
			}
			else {
				lowerCase++;
			}
		}
		
		System.out.println(upperCase);
		System.out.println(lowerCase);
	
	}
}
