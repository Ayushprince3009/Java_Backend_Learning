package com.kodewala.completableFuture.class1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

//we will use this concept to join two things like we are getting order 
//deatils and we are getting customer details. then to show full info on 
//dashboard we will use this to join both and show the result to dashboard.


public class Driver1 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		// cf1
		CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(() -> {
			System.out.println(Thread.currentThread().getName());
			return 20;
		}).thenApplyAsync((n) -> {
			System.out.println(Thread.currentThread().getName());
			return n * 10;
		});

		// cf2

		CompletableFuture<Integer> cf2 = CompletableFuture.supplyAsync(() -> {
			System.out.println(Thread.currentThread().getName());
			return 30;
		}).thenApplyAsync((n) -> {
			System.out.println(Thread.currentThread().getName());
			return n * 10;
		});

		// System.out.println(completableFuture.get());
		
		//combine the result
		
		CompletableFuture<Integer> result = cf2.thenCombineAsync(cf1, (a,b) -> a+b);
		System.out.println(result.get());
	}
}
