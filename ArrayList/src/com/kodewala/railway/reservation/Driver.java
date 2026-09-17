package com.kodewala.railway.reservation;
import java.util.ArrayList;
public class Driver {
	public static void main(String[] args) {
		ArrayList<String> waitingList = new ArrayList<String>();
		waitingList.add("Rahul");
		waitingList.add("Amit");
		waitingList.add("Neha");
		waitingList.add("Rahul");
		waitingList.add("Priya");
		waitingList.add("Karan");
		waitingList.add("Rahul");
		
		waitingList.add(0, "Vikash");
		waitingList.add(3, "Pooja");
		waitingList.set(waitingList.indexOf("Neha"), "Anjali");
		waitingList.indexOf("Rahul");
		waitingList.lastIndexOf("Rahul");
		waitingList.remove("Rahul");
		waitingList.remove(waitingList.indexOf("Karan"));
		waitingList.contains("Priya");
		waitingList.get(0);
		waitingList.get(waitingList.size()-1);
		
		System.out.println(waitingList);
		
	}
}
