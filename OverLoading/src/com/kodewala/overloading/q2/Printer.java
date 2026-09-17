package com.kodewala.overloading.q2;

public class Printer {
	public void print(String text) {
		System.out.println("text:-" +text);
	}
	
	void print(int num) {
		System.out.println("Num:-"+num);
	}
	
	void print(char ch) {
		System.out.println("char:-"+ch);
	}
}
