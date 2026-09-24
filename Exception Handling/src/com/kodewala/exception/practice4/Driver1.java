package com.kodewala.exception.practice4;

public class Driver1 {
	public static void main(String[] args) {
		Method method = new Method();
		System.out.println(method.value(34));
		
	}
	
}


class Method {
	public int value(int num) {
		try {
			return 10;
		}
		finally {
			return 20;
		}
	}
}