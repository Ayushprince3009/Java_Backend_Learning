package com.kodewala.interfaace.pq1;

public class Driver3 {
	public static void main(String[] args) {
		Notification email = new EmailNotification();
		email.sendNotification();
		email.status();
		
		Notification sms = new SMSNotification();
		sms.sendNotification();
		sms.status();
	}
}

interface Notification{
	void sendNotification();
	
	default void status() {
		System.out.println("Notification Sent");
	}
}

class EmailNotification implements Notification{
	@Override
	public void sendNotification() {
		System.out.println("Notification Sent Using EmailNotification");
	}
}

class SMSNotification implements Notification{
	@Override
	public void sendNotification() {
		System.out.println("Notification sent using SMSNotification");
	}
	
	@Override
	public void status() {
		System.out.println("Message Delivered Successfully");
	}
}