package com.kodewala.multithrea.practice2;

public class Driver5 {
	public static void main(String[] args) {
		Copy c = new Copy();
		
		Book b = new Book(c);
		b.start();
		
		Book s = new Book(c);
		s.start();
	}
}

class Copy{
	public void write() {
		System.out.println("doing work....[ "+Thread.currentThread().getName()+" ]");
		System.out.println("doing work....[ "+Thread.currentThread().getName()+" ]");
		System.out.println("doing work....[ "+Thread.currentThread().getName()+" ]");
		System.out.println("doing work....[ "+Thread.currentThread().getName()+" ]");
		System.out.println("doing work....[ "+Thread.currentThread().getName()+" ]");
		System.out.println("doing work....[ "+Thread.currentThread().getName()+" ]");
		System.out.println("doing work....[ "+Thread.currentThread().getName()+" ]");
	}
}

class Book extends Thread{
	
	Copy copy; 
	
	public Book(Copy _copy) {
		this.copy = _copy;
	}
	
	@Override
	public void run() {
		copy.write();
	}
}