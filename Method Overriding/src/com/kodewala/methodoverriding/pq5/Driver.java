package com.kodewala.methodoverriding.pq5;

public class Driver {
	public static void main(String[] args) {
		Employee d = new Developer();
		d.work();
		
		Developer e = (Developer ) d;
		e.work();
	}
}
