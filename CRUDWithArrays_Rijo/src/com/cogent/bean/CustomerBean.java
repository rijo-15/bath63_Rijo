package com.cogent.bean;

import java.io.Serializable;

public class CustomerBean implements Serializable {
	
	private long customerId;
	private String customerName;
	
	
	
	public CustomerBean(long customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}



	public long getCustomerId() {
		return customerId;
	}



	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}  
	
	
	
	

}
