package com.kodewala.multithrea.practice3;

public class Driver2 {
	public static void main(String[] args) {
		System.out.println("Main..."+" ["+Thread.currentThread().getName()+"]");
		EvenNumber en = new EvenNumber();
		EvenRunnable er = new EvenRunnable(en);
		Thread t1 = new Thread(er);
		t1.start();
		
		Thread t2 = new Thread(er);
		t2.start();
		
		Thread t3 = new Thread(er);
		t3.start();
		
		System.out.println("Main ends....");
	}
}

class EvenNumber{
	public synchronized void even() {
		for(int i=1; i<11; i++) { 
			if(i % 2 == 0) {
				System.out.println("Even:- "+i+" ["+Thread.currentThread().getName()+"]");
			}
			else {
				System.out.println("Odd:- "+i+" ["+Thread.currentThread().getName()+"]");
			}
		}
	}
}

class EvenRunnable implements Runnable{
	EvenNumber number;
	
	public EvenRunnable(EvenNumber num) {
		this.number = num;
	}
	
	@Override
	public void run() {
		number.even();
	}
}