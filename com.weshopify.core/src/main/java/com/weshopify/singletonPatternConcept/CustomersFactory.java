package com.weshopify.singletonPatternConcept;

import com.weshopify.core.CustomerBean;

public class CustomersFactory {

	private static CustomerBean customer=null;
//	Egar Instantiation
	static {
		if(customer==null)
		{
			customer=new CustomerBean();
		}
	}
	public static CustomerBean createCustomer()
	{
//		if(customer==null)
//		{
//			customer=new CustomerBean();
//		}
		return customer;
	}
	
}

// Lazy Loading : When we call the CstomerBean() method at that time object is creating.
// Eager Loading : At the time of class loading the object is creating and when we call the method the already created object is creating.