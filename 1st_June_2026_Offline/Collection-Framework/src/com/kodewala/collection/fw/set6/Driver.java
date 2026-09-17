package com.kodewala.collection.fw.set6;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Payment implements Comparable<Payment> {
	String refId;

	public Payment(String refId) {
		super();
		this.refId = refId;
	}

	@Override
	public int compareTo(Payment o) {

		int result = this.refId.compareTo(o.refId);
		// System.out.println(this.refId + " , " + o.refId + " and result is " +
		// result);
		return result;
	}

}

public class Driver {

	public static void main(String[] args) {

		Set<Payment> paymentSet = new TreeSet<Payment>();

		Payment p1 = new Payment("ABCD");
		Payment p2 = new Payment("JHGFDS");
		Payment p4 = new Payment("MNBVCX");
		Payment p3 = new Payment("MNHGRE");

		paymentSet.add(p1);
		paymentSet.add(p2);
		paymentSet.add(p3);
		paymentSet.add(p4);
		
		Iterator<Payment> itr = paymentSet.iterator();

		while (itr.hasNext()) 
		{
			Payment pyament = itr.next();
			System.out.println(pyament.refId);
		}

	}

}
