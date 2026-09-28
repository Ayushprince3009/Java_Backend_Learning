package com.kodewala.multithrea.practice4;

public class Driver {
	public static void main(String[] args) {
		Table t = new Table();
		TableTask t11 = new TableTask(t);
		t11.start();
		
	
		TableTask t1 = new TableTask(t);
		t1.start();
		
		TableTask t2 = new TableTask(t);
		t2.start();
		
		TableTask t3 = new TableTask(t);
		t3.start();
	}
}

class Table{
	public synchronized void printTable() {
		for(int i=1; i<=10; i++) {
			System.out.println("7 * "+i+" = "+7*i+" ["+Thread.currentThread().getName()+"]");
		}
	}
}

class TableTask extends Thread{
	
	Table table;
	
	public TableTask(Table _table) {
		this.table = _table;
	}
	
	@Override
	public void run() {
		table.printTable();
	}
}