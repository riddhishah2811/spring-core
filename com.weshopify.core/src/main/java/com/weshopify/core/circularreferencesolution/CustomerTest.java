package com.weshopify.core.circularreferencesolution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerTest {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(CustomerConfig.class);
		System.out.println("Cutomer Id  :"+context.getBean(HomeLoanAccount.class).getCustomerBean().getId());
		System.out.println("HomeLoan Amount :"+context.getBean(CustomerBean.class).getHomeLoanAccount().getAmt());
		System.out.println("Customer Name :"+context.getBean(CustomerBean.class).getHomeLoanAccount().getCustomerBean().getName());
		System.out.println("HomeLoan Account Number :"+context.getBean(HomeLoanAccount.class).getCustomerBean().getHomeLoanAccount().getNumber());
	}
}
