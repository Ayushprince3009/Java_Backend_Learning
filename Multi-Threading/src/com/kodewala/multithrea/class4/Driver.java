package com.kodewala.multithrea.class4;

public class Driver {
	public static void main(String[] args) {
		Task task1 = new Task();
		
		PrintThread t1 = new PrintThread(task1);
		t1.setName("Thread-1");
		t1.start();
		
//		PrintThread t2 = new PrintThread(task1);
//		t2.setName("Thread-2");
//		t2.start();
		
		Task task2 = new Task();
		PrintThread t2 = new PrintThread(task2);
		t2.setName("Thread-2");
		t2.start();
	}
}

class Task{
	public synchronized void printNumber() {
		for(int i=0; i<10; i++) {
			System.out.println("Printing number:-"+i+" ["+Thread.currentThread().getName()+"]");
		}
	}
}

class PrintThread extends Thread{
	Task task;
	
	PrintThread(Task _task){
		this.task = _task;
	}
	
	@Override
	public void run() {
		task.printNumber();
	}
}