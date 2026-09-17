package com.kodewala.interfaceDPS.p2;

interface INotification {
	void notificationType();
	
	public default void sendNotification() {
		System.out.println("Notification Sent");
	}
}
