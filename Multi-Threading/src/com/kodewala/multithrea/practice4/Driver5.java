package com.kodewala.multithrea.practice4;

public class Driver5 {
	public static void main(String[] args) {
		Movies m = new Movies();
		Kodewalaa k = new Kodewalaa(m);
		
		Thread t1 = new Thread(k);
		t1.start();
		
		Thread t2 = new Thread(k);
		t2.start();
		
		Thread t3 = new Thread(k);
		t3.start();
	}
}

class Movies{
	public synchronized void moviesName() {
		System.out.println("Sainik ["+Thread.currentThread().getName()+"]");
		System.out.println("Ghost ["+Thread.currentThread().getName()+"]");
		System.out.println("Read-Write ["+Thread.currentThread().getName()+"]");
		System.out.println("Ghost! ["+Thread.currentThread().getName()+"]");
		System.out.println("Karam ["+Thread.currentThread().getName()+"]");
		System.out.println("Skyfall ["+Thread.currentThread().getName()+"]");
	}
}

class Kodewalaa implements Runnable{
	
	Movies movie;
	
	public Kodewalaa(Movies movie) {
		this.movie = movie;
	}
	
	@Override
	public void run() {
		movie.moviesName();
	}
}