package com.kodewala.multithrea.class7;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Driver2 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(1);
		Future<Integer> future = es.submit(new MyThread1());
		System.out.println("result:- "+future.get());

		es.shutdown();
	}
	

}

class MyThread1 implements Callable<Integer>{
	
	@Override
	public Integer call() {
		return 20;
	}
}