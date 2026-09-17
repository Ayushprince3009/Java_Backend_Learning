//Delete characters from index 2 to 5 in "Programming".
package com.kodewala.string.Stringbuilder;

public class Q2 {

	public static void main(String[] args) {
		StringBuilder str =new StringBuilder("Programming");
		System.out.println(str);
		str.delete(2, 5);
		System.out.println(str);
	}

}
