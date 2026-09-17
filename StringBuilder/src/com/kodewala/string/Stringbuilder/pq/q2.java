package com.kodewala.string.Stringbuilder.pq;

public class q2 {
	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder("EMP101");
//		int index = sb.length();
//		sb.insert(index, " IT");
//		sb.append(" 2026");
//		sb.delete(sb.indexOf("101"),sb.indexOf("101")+"101".length());
//		int indexIT = sb.indexOf("IT");
//		System.out.println(indexIT);
//		System.out.println(sb.capacity());
//		System.out.println(sb);
//		
//		String str = sb.toString();
//		System.out.println(sb.equals(str));
//		System.out.println(str);
//		
//		StringBuilder sb = new StringBuilder("ayush");
//		sb.append("@gmail.com");
//		System.out.println(sb);
//		sb.replace(sb.indexOf("gmail"),sb.indexOf("gmail")+"gmail".length() , "outlook");
//		System.out.println(sb);
//		
//		System.out.println(sb.substring(sb.indexOf("outlook"),sb.indexOf("outlook")+"outlook".length()));
//		System.out.println(sb.charAt(2));
//		System.out.println(sb.length());
//		System.out.println(sb.toString());
		
//		StringBuilder sb = new StringBuilder("BTMStage");
//		sb.insert(sb.indexOf("Stage"), " 2nd ").append(", Bangalore");
//		//sb.delete(sb.indexOf(","), sb.indexOf(",")+",".length());
//		sb.deleteCharAt(sb.indexOf(","));
//		sb.reverse().reverse();
//		System.out.println(sb);
		
		StringBuilder sb = new StringBuilder();
		sb.append("Ayush").append("\nJava Developer");
		sb.insert(0, "Resume\n");
		sb.replace(sb.indexOf("Java Developer"), sb.indexOf("Java Developer")+"Java Developer".length(), "Full Stack Developer");
		System.out.println("Capacity: "+sb.capacity());
		sb.trimToSize();
		System.out.println("New Capacity: "+sb.capacity());
		System.out.println(sb);
		
	}
}
