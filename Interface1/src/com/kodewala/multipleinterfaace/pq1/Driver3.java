package com.kodewala.multipleinterfaace.pq1;

public class Driver3 {
	public static void main(String[] args) {
		EmailService email = new NotificationManager();
		email.sendNotification();
	}
}

interface EmailService{
	default void sendNotification() {
		System.out.println("Email Notification Sent");
	}
}

interface SMSService{
	default void sendNotification() {
		System.out.println("SMS Notification Sent");
	}
}

class NotificationManager implements EmailService, SMSService{
	@Override
	public void sendNotification() {
		System.out.println("Message sending start ");
		EmailService.super.sendNotification();
		SMSService.super.sendNotification();
		System.out.println("Message sending end");
	}
}