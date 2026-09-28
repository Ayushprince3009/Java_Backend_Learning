package com.kodewala.multithrea.practice4;

public class Driver3 {
	public static void main(String[] args) {
		Kodewala k = new Kodewala();
		Nishita n = new Nishita(k);
		Thread t = new Thread(n);
		t.setName("Thread-1");
		t.start();
		
		Kodewala k1 = new Kodewala();
		Nishita n1 = new Nishita(k1);
		Thread t1 = new Thread(n1);
		t1.setName("Thread-2");
		t1.start();
	}
}

class Kodewala{
	public synchronized void printNotes() {
		System.out.println("Welcome to Kodewala ["+Thread.currentThread().getName()+"]");
		System.out.println("It is at BTM ["+Thread.currentThread().getName()+"]");
		System.out.println("Run by Suresh Bishnoi Sir ["+Thread.currentThread().getName()+"]");
	}
}

class Nishita extends Thread{
	Kodewala kodewala;
	
	public Nishita(Kodewala kodewala) {
		this.kodewala = kodewala;
	}
	
	@Override
	public void run() {
		kodewala.printNotes();
	}
}