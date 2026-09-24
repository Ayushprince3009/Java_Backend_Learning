package com.kodewala.multithrea.practice2;

public class Driver4 {
	public static void main(String[] args) {
		System.out.println("Main Startssss....");
		System.out.println( "["+Thread.currentThread().getName()+"]");
		Aman a = new Aman();
		Apply t1 = new Apply(a);
		t1.start();
		
		//Aman b = new Aman();
		Apply t2 = new Apply(a);
		t2.start();
		
		System.out.println("Main endssss....");
		System.out.println( "["+Thread.currentThread().getName()+"]");
	}
}

class Aman {
	
	public synchronized void readDSA() {
		System.out.println("H"+" ["+Thread.currentThread().getName()+"]");
		System.out.println("E"+" ["+Thread.currentThread().getName()+"]");
		System.out.println("E"+" ["+Thread.currentThread().getName()+"]");
		System.out.println("L"+" ["+Thread.currentThread().getName()+"]");
		System.out.println("O"+" ["+Thread.currentThread().getName()+"]");
	}
}

class Apply extends Thread{
	
	Aman aman;
	
	public Apply(Aman _aman) {
		this.aman = _aman;
	}
	
	@Override
	public void run() {
		aman.readDSA();
	}
}