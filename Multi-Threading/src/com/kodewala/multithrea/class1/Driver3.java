package com.kodewala.multithrea.class1;

public class Driver3 {

    public static void main(String[] args) {

        System.out.println("A");

        MyThreead t1 = new MyThreead();
        t1.start();

        System.out.println("B");

        MyThreead t2 = new MyThreead();
        t2.start();

        System.out.println("C");
    }
}

class MyThreead extends Thread{
	@Override
	public void run() {
		System.out.println("D");
		System.out.println("Thread Name: {"+Thread.currentThread().getName()+"}");
	}
}