package com.kodewala.string;

public class NonRepeating {

	public static void main(String[] args) {
		String text = "Bangalore";
		char[] array = text.toCharArray();
		
		for(int i=0; i<array.length; i++) {
			char current = array[i];
			
			if(text.indexOf(current) == text.lastIndexOf(current)) {
				System.out.println(current);
				break;
			}
		}
	}

}
