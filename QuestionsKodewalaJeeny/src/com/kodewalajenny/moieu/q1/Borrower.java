package com.kodewalajenny.moieu.q1;

public class Borrower extends LibraryManagement {
	private String name;
	private int borrowedDays;
	
	public Borrower(String bookName, String bookType, String bookId, int allowedDays, String name, int borrowedDays) {
		super(bookName, bookType,  bookId,  allowedDays);
		this.name = name;
		this.borrowedDays = borrowedDays;
	}
	
	int lateDays = 0; 
	
	@Override
	public int lateDays(int allowedDays, int borrowedDays) {
		if(allowedDays <= borrowedDays) {
			lateDays = 0;
		}else {
			lateDays = borrowedDays - allowedDays;
		}
		return lateDays;
	}
	
	
	//int fine = 0;
	
	@Override
	public int lateFine(int lateDays) {
		if(lateDays <= 0) {
			fine = 0;
		}else {
			if(lateDays <= 7) {
				fine = 50;
			}else {
				fine = lateDays * 10;
			}
		}
		return fine;
	}
}
