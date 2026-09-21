package com.kodewala.multithrea.class3;

public class UnSynchrnized {
	public static void main(String[] args) {
		Taskk task1 = new Taskk();
		PrinterThread t1 = new PrinterThread(task1);
		t1.setName("Thread-1");
		t1.start();
		
		PrinterThread t2 = new PrinterThread(task1);
		t2.setName("Thread-2");
		t2.start();
		
	}
}

class Taskk{
	public void printNumber() {  //synchronized also use here
		for(int i=0; i<10; i++) {
			System.out.println("Printing.... "+i+"["+Thread.currentThread().getName()+"]");
		}
	}
}

class PrinterThread extends Thread{
	Taskk task;
	
	PrinterThread(Taskk _task){
		this.task = _task;
	}
	
	@Override
	public void run() {
		task.printNumber();
	}
}