package com.kodewala.string.practice;

public class ReplaceWithSpace {
	public static void main(String[] args) {
		String str = "a good boy with ambition and motivation.";
		
		String strNew = str.replace(" ", "_");
		
		System.out.println(strNew);
		
		System.out.println(strNew.replace('a', '@'));
	}
}
