package com.kodewala.inheritance.q2;

public class Customer {
	private String customerId;
	private String customerName;
	private String mobileNumber;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		if(customerId == null || customerId.isEmpty()) {
			this.customerId = "CUST000";
		}
		else {
			this.customerId = customerId;
		}
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		if(customerName == null || customerName.isEmpty()) {
			this.customerName = "Unknown";
		}
		else {
			this.customerName = customerName;
		}
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		if(mobileNumber == null || mobileNumber.length() != 10) {
			this.mobileNumber = "0000000000";
		}
		else {
			this.mobileNumber = mobileNumber;
		}
	}
	
	public Customer() {
		this("CUST000","Unknown","000000000");
	}
	public Customer(String customerId, String customerName, String mobileNumber) {
		this.setCustomerId(customerId);
		this.setCustomerName(customerName);
		this.setMobileNumber(mobileNumber);
	}
	
	public void showCustomerDetails() {
		System.out.println("Customer ID:- "+getCustomerId());
		System.out.println("Customer Name:- "+getCustomerName());
		System.out.println("Mobile Number:- "+getMobileNumber());
	}
}

class FoodOrder extends Customer{
	private String resturantName;
	private double orderAmount;
	private String paymentMode;
	
	public String getResturantName() {
		return resturantName;
	}
	public void setResturantName(String resturantName) {
		if(resturantName == null || resturantName.isEmpty()) {
			this.resturantName = "Unknown Resturant";
		}
		else {
			this.resturantName = resturantName;
		}
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		if(orderAmount < 0) {
			this.orderAmount = 0;
		}
		else {
			this.orderAmount = orderAmount;
		}
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		if(paymentMode.equalsIgnoreCase("upi") || paymentMode.equalsIgnoreCase("card") || paymentMode.equalsIgnoreCase("cash")){
			this.paymentMode = paymentMode;
		}
		else {
			this.paymentMode = "Cash";
		}
	}
	
	public FoodOrder() {
		this("CUST0000","Unknown","0000000000","Unknown Resturant",0,"cash");
	}
	public FoodOrder(String customerId,String customerName,String mobileNumber,String resturantName, double orderAmount, String paymentMode){
		super(customerId,customerName,mobileNumber);
		this.setOrderAmount(orderAmount);
		this.setResturantName(resturantName);
		this.setPaymentMode(paymentMode);
	}
	
	public void showDetails() {
		System.out.println("Resturant Name:- "+getResturantName());
		System.out.println("Order Amount:- "+getOrderAmount());
		System.out.println("Payment Mode:- "+getPaymentMode());
	}
	
	public double calculateDiscount() {
		double discount = 0;
		if(getOrderAmount() >= 2000) {
			discount = (getOrderAmount()*20)/100;
		}
		else if(getOrderAmount() >= 1000) {
			discount = (getOrderAmount()*10)/100;
		}
		else {
			discount = (getOrderAmount()*5)/100;
		}
		return discount;
	}
	
	public int calculateDeliveryCharge() {
		int deliveryCharge = 0;
		if(getOrderAmount() >= 500) {
			deliveryCharge = 0;
		}
		else {
			deliveryCharge = 50;
		}
		return deliveryCharge;
	}
	
	public double calculateGST() {
		double gstAmount = ((getOrderAmount() - calculateDiscount()) * 5) / 100;
		return gstAmount;
	}
	
	public double finalBill() {
		double billAmount = getOrderAmount() - calculateDiscount() + calculateGST() + calculateDeliveryCharge();
		return billAmount;
	}
	
	public void billDetails() {
		System.out.println("Discount:- "+calculateDiscount());
		System.out.println("Delivery Charge:- "+calculateDeliveryCharge());
		System.out.println("GST:- "+calculateGST());
		System.out.println("Payable Amount:- "+finalBill());
	}
}
