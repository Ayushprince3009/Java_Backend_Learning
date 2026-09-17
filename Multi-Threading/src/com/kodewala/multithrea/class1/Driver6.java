package com.kodewala.multithrea.class1;

public class Driver6 {
	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		MyThread t2 = t1;

		t1.start();
		//t2.start();
	}

}

class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("Executing");
	}
}
