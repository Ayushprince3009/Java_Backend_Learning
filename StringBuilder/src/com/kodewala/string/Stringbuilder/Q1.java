//Create a StringBuilder object containing "Java" and print it.

package com.kodewala.string.Stringbuilder;

public class Q1 {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		str.append("Java");
		
		System.out.println(str);
		
//		str.append(" Developer");
//		System.out.println(str);
//		
//		str.insert(0, "Awesome ");
//		System.out.println(str);
		
		//str.replace(0,1,"K");
		
		//str.reverse();
		str.delete(str.length()-1,str.length());
		System.out.println(str);
	}

}
