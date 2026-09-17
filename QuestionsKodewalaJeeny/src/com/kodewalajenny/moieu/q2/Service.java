package com.kodewalajenny.moieu.q2;

public class Service {
	public int details(InsurancePatient inc) {
		public totalBill(inc.getRoomCharge(), inc.getDays()) {
			int billAmount = (int)(inc.getRoomCharge() * inc.getDays());
			return billAmount;
		}
		
		public int insuranceDiscount(double insuranceCoverage, int billAmount) {
			int insuranceAmount = (int)((insuranceCoverage*billAmount)/100);
			return insuranceAmount;
		}
		
		public int finalBill(int billAmount, int insuranceAmount) {
			int finalAmount = billAmount - insuranceAmount;
			return finalAmount;
		}
		
		public int payableAmount(int finalBill) {
			int payableAmount = 0;
			
			if(finalBill > 50000) {
				 payableAmount = finalBill - (finalBill - (5/100));
			}
			else {
				 payableAmount = finalBill;
			}
			return payableAmount;
		}
		
		public void displayDetails() {
			System.out.println("PatientId: "+getPatientId());
			System.out.println("Patient Name: "+getPatientName());
			System.out.println("Age: "+getAge());
			System.out.println("Room Charge: "+getRoomCharge());
			System.out.println("Days: "+getDays());
			int totalBill = totalBill(getRoomCharge(), getDays());
			
		}
	}

	
	
}
