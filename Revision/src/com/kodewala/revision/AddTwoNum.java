package com.kodewala.revision;

public class AddTwoNum {
	public static void main(String[] args) {
		String a = args[0];
		int num1 = Integer.parseInt(a);
		
		String b = args[1];
		int num2 = Integer.parseInt(b);
		
		int result = add.addTwo(num1, num2);
		System.out.println("Result:- "+ result);
	}
}

class add{
	public static int addTwo(int num1, int num2) {
		int res = num1 + num2;
		return res;
	}
}