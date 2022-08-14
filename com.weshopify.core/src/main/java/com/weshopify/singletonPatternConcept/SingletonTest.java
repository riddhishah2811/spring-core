package com.weshopify.singletonPatternConcept;

public class SingletonTest {

	public static void main(String[] args) {
		System.out.println(CustomersFactory.createCustomer().hashCode());
		System.out.println(CustomersFactory.createCustomer().hashCode());
		System.out.println(CustomersFactory.createCustomer().hashCode());
		System.out.println(CustomersFactory.createCustomer().hashCode());
		
	}
}
