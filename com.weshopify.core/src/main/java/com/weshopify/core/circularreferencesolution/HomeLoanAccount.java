package com.weshopify.core.circularreferencesolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomeLoanAccount {
	private int amt=12543;
	private String number="6666666";
	
	private CustomerBean customerBean;

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public CustomerBean getCustomerBean() {
		return customerBean;
	}

//	Proxy Method for Circular References
	@Autowired
	public void setCustomerBean(CustomerBean customerBean) {
		this.customerBean = customerBean;
	}
	
	
}
