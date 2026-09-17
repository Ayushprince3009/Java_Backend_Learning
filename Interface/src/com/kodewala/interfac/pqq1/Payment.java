package com.kodewala.interfac.pqq1;

public interface Payment{
	public abstract void Pay();
	void doSome();
}

class UPIPayment implements Payment{

	@Override
	public void Pay() {
		System.out.println("Payment through UPI");
	}
	
	@Override
	public void doSome() {
		System.out.println("Nothing Done");
	}
	
}

