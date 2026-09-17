package com.kodewala.string;

public class StringClass {

	public static void main(String[] args) {
		String city = "bangalore";
		String name = "Ayush";
		String country = "india";
		String c = "ayush";
		String ct = "ayush";
		
		/* here in scp java will check for the value of city if 
		 * it is not present there a new object will be created 
		 * and if it is present then it will refer to the same */
		System.out.println(city == country);
		System.out.println(c == ct);
		System.out.println(name == ct);

	}

}
