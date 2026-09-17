package com.kodewala.string.practice;

public class EndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Developer.java";
		String str1 = "Java Deve loper";
		String str3 = "Hello World";
		String email = "abc@gmail.com";
		
//		System.out.println(str.endsWith(".java"));
		System.out.println(str.indexOf("p"));
		System.out.println(str.length());
		System.out.println(str.indexOf('.'));
		System.out.println(str.lastIndexOf("a"));
		System.out.println(str.lastIndexOf('e'));
		System.out.println(str.contains(".java"));
		System.out.println(str.indexOf("per"));
		System.out.println(str.indexOf(".java"));
		System.out.println(str.indexOf("python"));
		System.out.println(str1.lastIndexOf(" "));
		System.out.println(str3.startsWith("Hello"));
		System.out.println(str3.endsWith("World"));
		System.out.println(email.endsWith(".com"));
	}

}
