package com.weshopify.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.weshopify.commons.Product;



// Config is equivalant to the .xml file. It is the alternation of the .xml file not the replacement. 
@Configuration
@ComponentScan(basePackages = {"com.weshopify.core"})
public class CustomerConfig {
	
	@Bean
	PersonalLoanAccount personalLoanAccount() {
		System.out.println("Creating Personal Loan Account Spring Bean");
		PersonalLoanAccount pl=new PersonalLoanAccount();
		pl.setLoanAmount(120380);
		pl.setLoanId(12345);
		return new PersonalLoanAccount();
	}
	
//	Product is from another package.
//	When any external jar file used and if  the classes in that external jar files to be defined as a spring beans, then we can go with the @Bean annotation by creating an object for the external classes inside the jar and we can mark them as a spring bean using @Bean annotation.
	@Bean 
	public Product product() {
		Product product=new Product();
		product.setName("Laptop");
		product.setPrice(30000);
		product.setProductId(123);
		return product;
	}
	
}
