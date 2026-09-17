package com.kodewalajenny.moieu.q1;

public class LibraryManagement {
	private String bookName;
	private String bookType;
	private String bookId;
	private int allowedDays;

	public LibraryManagement(String bookName, String bookType, String bookId, int allowedDays) {
		this.bookName = bookName;
		this.bookType = bookType;
		this.bookId = bookId;
		this.allowedDays = allowedDays;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public int getAllowedDays() {
		return allowedDays;
	}

	public void setAllowedDays(int allowedDays) {
		this.allowedDays = allowedDays;
	}
	
	public int lateFine(int lateDays) {
		return 0;
	}
	
	public int lateDays(int allowedDays, int borrowedDays) {
		return 0;
	}
}
