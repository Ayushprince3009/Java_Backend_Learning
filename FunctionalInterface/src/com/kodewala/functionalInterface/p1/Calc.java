package com.kodewala.functionalInterface.p1;


interface IAdding{
	public abstract int add(int a, int b);
}

public class Calc implements IAdding {
	
	@Override
	public int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
}
