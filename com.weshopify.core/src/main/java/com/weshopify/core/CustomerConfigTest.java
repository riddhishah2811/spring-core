package com.weshopify.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.weshopify.commons.Product;

public class CustomerConfigTest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(CustomerConfig.class);
		CustomerBean customerBean= context.getBean(CustomerBean.class);
		System.out.println(customerBean.getHomeLoanAccount().getLoanAmt());
		
		Product product=context.getBean(Product.class);
		System.out.println(product.getName());
	}

}
