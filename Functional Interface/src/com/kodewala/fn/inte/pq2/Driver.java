package com.kodewala.fn.inte.pq2;

interface IAdding{
	public abstract int add(int a, int b);
}

//class Calc implements IAdding {
//	
//	@Override
//	public int add(int a, int b) {
//		int sum = a+b;
//		return sum;
//	}
//}

public class Driver {
	public static void main(String[] args) {
//		IAdding adding = new Calc();
//		int sum = adding.add(2, 30);
//		System.out.println(sum);
	
	
		IAdding adding = (a,b) -> a+b;
		int sum = adding.add(14, 10);
		System.out.println(sum);
	}
}

