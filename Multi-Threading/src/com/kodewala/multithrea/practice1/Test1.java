package com.kodewala.multithrea.practice1;

class MyTask implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(
                Thread.currentThread().getName() + " : " + i
            );
        }
    }
}

public class Test1 {
    public static void main(String[] args) {

        Thread.currentThread().setName("MAIN");

        MyTask task = new MyTask();

        Thread t1 = new Thread(task);
        t1.setName("WORKER");

        t1.start();

        for (int i = 1; i <= 3; i++) {
            System.out.println(
                Thread.currentThread().getName() + " : " + i
            );
        }
    }
}
