package com.kodewala.dsa.array;

public class ForEach {

	public static void main(String[] args) {
//		String[] color = {"red","blue","black","green","orange","sky","purple"};
//		
//		int index =0;
//		for(String ele : color){
//			System.out.println("Index:-"+index + " Value:- "+ele);
//			index++;
//		}

		String[] book = {"the man", "you are", "mystry death", "Second life", "go there"};
		
		int index = 0;
		for(String bookName : book) {
			System.out.println(index+"->" + bookName);
			index++;
		}
	}
}
