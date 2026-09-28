package com.kodewala.multithrea.class6;

public class Producer extends Thread {

	Task task;

	public Producer(Task task) {
		super();
		this.task = task;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
				task.produce(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
