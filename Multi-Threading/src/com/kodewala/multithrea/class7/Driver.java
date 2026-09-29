package com.kodewala.multithrea.class7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Driver {
	public static void main(String[] args) {
		
		//we are going to use executor service
		
		ExecutorService executorservice = Executors.newFixedThreadPool(5); //pool of n threads
		
		//executing 10 tasks
		
		for(int i=0; i<11; i++) {
			MyThread task = new MyThread(i);
			executorservice.execute(task);
		}
		executorservice.shutdown();
	}
}

class MyThread extends Thread{
	int taskId;
	
	public MyThread(int taskId) {
		this.taskId = taskId;
	}
	
	
	@Override
	public void run() {
		System.out.println("MyThread.run().... task is "+taskId+" : ["+Thread.currentThread().getName()+"]");
	}
}

