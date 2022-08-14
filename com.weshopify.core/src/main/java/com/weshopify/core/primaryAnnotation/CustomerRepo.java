package com.weshopify.core.primaryAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerRepo {

	@Autowired
	@Qualifier(value = "postgres")// Same name give to the bean in property file[DataSourceConfig.java]
//	@Qualifier(${db.progres})
	private DataSource ds;
	
	public void saveCustomer() {
		System.out.println("Saving customer in db!");
		ds.initconnection();
	}
}
