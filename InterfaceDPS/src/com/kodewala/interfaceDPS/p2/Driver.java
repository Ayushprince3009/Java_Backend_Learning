package com.kodewala.interfaceDPS.p2;

public class Driver {
	public static void main(String[] args) {
//		EmailNotification email = new EmailNotification();
//		email.notificationType();
//		email.sendNotification();
//		System.out.println();
//		SMSNotification sms = new SMSNotification();
//		sms.notificationType();
//		sms.sendNotification();
		
		INotification email = new EmailNotification();
		email.notificationType();
		email.sendNotification();
	}
}
