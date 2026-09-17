package com.kodewala.string.practice;

public class RemoveSpace {

	public static void main(String[] args) {
		String str = " java is a pro gramming language  ";
		

//		String res = str.replaceAll(" ","");
//		System.out.println(res);
		
		int len = str.length();
		System.out.println(len);
		
		String res ="";
		
		for(int i=0; i <len; i++) {
			if(str.charAt(i) != ' ') {
				res += str.charAt(i);
			}
		}
		
		System.out.println(res);
	}

}
