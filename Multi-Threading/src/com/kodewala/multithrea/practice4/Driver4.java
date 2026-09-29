package com.kodewala.multithrea.practice4;

public class Driver4 {
	public static void main(String[] args) {
		Book b = new Book();
		Student s = new Student(b);
		s.start();
		
		Student s1 = new Student(b);
		s1.start();
		
		Student s2 = new Student(b);
		s2.start();
	}
}

class Book{
	public synchronized void bookName() {
		System.out.println("Java ["+Thread.currentThread().getName()+"]");
		System.out.println("C++ ["+Thread.currentThread().getName()+"]");
		System.out.println("Python ["+Thread.currentThread().getName()+"]");
		System.out.println("GoLang ["+Thread.currentThread().getName()+"]");
	}
}

class Student extends Thread{
	Book book;
	
	public Student(Book _book) {
		this.book = _book;
	}
	
	@Override
	public void run() {
		book.bookName();
	}
}