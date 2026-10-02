package com.kodewala.multithrea.practice5;

public class Driver1 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("He went to market");
		Book b = new Book();
		b.start();
		
		b.join(0);
		
		System.out.println("He came back to home");
	}
}

class Book extends Thread{
	@Override
	public void run() {
		System.out.println("He took the Book");
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("He returned the Book");
	}
}