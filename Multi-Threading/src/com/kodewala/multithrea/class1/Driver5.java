package com.kodewala.multithrea.class1;

import javax.management.Notification;

public class Driver5 {
	public static void main(String[] args) {
		PaymentThread p = new PaymentThread();
		p.start();
		
		OrderThread o = new OrderThread();
		o.start();
		
		InventoryThread i = new InventoryThread();
		i.start();
		
		NotificationThread n = new NotificationThread();
		n.start();
		
		ReportThread r = new ReportThread();
		r.start();
	}
}

class PaymentThread extends Thread {
	@Override
	public void run() {
		System.out.println("Payment Thread");
		System.out.println("Current Thread is:{" + Thread.currentThread().getName() + "}");
	}
}

class OrderThread extends Thread{
	@Override
	public void run() {
		System.out.println("Order Thread");
		System.out.println("Current Thread is:{"+Thread.currentThread().getName()+"}");
	}
}

class InventoryThread extends Thread{
	@Override
	public void run() {
		System.out.println("Inventory Thread");
		System.out.println("Current Thread is:{"+Thread.currentThread().getName()+"}");
	}
}

class NotificationThread extends Thread{
	@Override
	public void run() {
		System.out.println("Notificatton Thread");
		System.out.println("Current Thread is:{"+Thread.currentThread().getName()+"}");
	}
}

class ReportThread extends Thread{
	@Override
	public void run() {
		System.out.println("Report Thread");
		System.out.println("Current Thread is:{"+Thread.currentThread().getName()+"}");
	}
}