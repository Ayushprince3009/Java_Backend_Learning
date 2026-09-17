package com.kodewala.string.Stringbuilder.pq;

public class q3 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		
		sb.append(" Developer");
		
		sb.replace(0, 1,"K");
		
		sb.reverse();
		
		System.out.println(sb);
		
		
		
		StringBuilder sbs = new StringBuilder("Programming");
		System.out.println(sbs);
	}
}
