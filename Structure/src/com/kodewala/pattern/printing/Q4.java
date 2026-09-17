package com.kodewala.pattern.printing;

public class Q4 {
	public static void main(String[] args) {
		int n=4;
		for(int row=1; row<=n; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int row=1; row<=(n-1); row++) {
			for(int col=1; col<=n-row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
