package com.kodewala.dsa.string;

public class RemoveSpace {
	public static void main(String[] args) {
		String str = " ayu sh ku marp rin ce";
		
//		int i = 0;
		
//		String newStr = "";
//		while(i < str.length()) {
//			char ch = str.charAt(i);
//			
//			if(ch != ' ') {
//				newStr += ch;
//			}
//			i++;
//		}
//		System.out.println(newStr);
		
		char[] ch = str.toCharArray();
		
		int index =  0;
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i] != ' ') {
				ch[index] = ch[i];
				index++;
			}
			
		}
		
		for(int i=0; i<index; i++) {
			System.out.print(ch[i]);
		}
	}
}
