package com.weshopify.core.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.weshopify.core.prototype")
public class ProductConfig {

	@Autowired
	private Product product;
	
	@Bean
	public Order getOrder()
	{
		Order order = new Order();
		order.setOrderType("Books");
		order.setProduct(product);
		return order;
	}
}
