package com.kodewala.multithrea.class6;

public class Driver {

	public static void main(String[] args)
{
		Task task = new Task();

		Producer producer = new Producer(task);
		Consumer consumer = new Consumer(task);
		producer.setName("Producer");
		consumer.setName("Consumer");
		
		consumer.start();
		producer.start();

	}

}