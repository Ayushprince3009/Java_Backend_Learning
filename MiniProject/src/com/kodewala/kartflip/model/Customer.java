package com.kodewala.kartflip.model;

public class Customer {
	private String customerId;
	private String name;
	private String email;
	private String mobile;
	private String address;
	
	public Customer(String _customerId, String _name, String _email, String _mobile, String _address) {
		this.customerId = _customerId;
		this.name = _name;
		this.email = _email;
		this.mobile = _mobile;
		this.address = _address;
	}
	
	public String getCustomerId() {
		return customerId;
	}
//	public void setCustomerId(String customerId) {  //no need to give setter as this is automatic generated fom name or email id  
//		this.customerId = customerId;
//	}
	
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	
	public String getEmail() {
		return email;
	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
	
	public String getMobile() {
		return  mobile;
	}
//	public void setMobile(String mobile) {
//		this.mobile = mobile;
//	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
