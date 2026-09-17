package com.kodewalajenny.moieu.q2;

public class InsurancePatient extends InPatient {
	
	private double insuranceCoverage;  //percentage
	
	public InsurancePatient(String patientId, String patientName, int age,double roomCharge,int days, double insuranceCoverage) {
		super(patientId, patientName, age, roomCharge,days);
		
	}

	public double getInsuranceCoverage() {
		return insuranceCoverage;
	}

	public void setInsuranceCoverage(double insuranceCoverage) {
		
		if((insuranceCoverage > 0) && (insuranceCoverage < 100)) {
			this.insuranceCoverage = insuranceCoverage;
		}
		else {
			System.out.println("Insurance not applicable");
		}
	}
	
	
	
}
