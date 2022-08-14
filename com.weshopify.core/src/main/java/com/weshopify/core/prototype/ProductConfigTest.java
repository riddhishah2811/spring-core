package com.weshopify.core.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductConfigTest {

	public static void main(String[] args) {
		/*
		 * 1. What happens if the singleton scope bean will be injected to the prototype scope bean?
		 * Ans. When a singleton scope is injecting into prototype scope bean , then the singleton scope bean will be injected at 
		 * 		only once into the prototype beans, no matter how many times the prototype bean is creating.Bcz singleton bean will create only once 
		 * 		throughout the container.
		 * 
		 *  2. What happens if the prototype scope will be injected into singleton scope bean?
		 *  Ans. When a prototype scope bean is injecting into the singleton scope bean , then the prototype scope bean will be injected at only once
		 *  	 into  the singleton bean while singleton bean creation. Bz singleton bean create only once and during that time only one the prototype bean 
		 *  	 ill be injected.(Remember that the prototype bean is not become the singleton object. It's created once into the singletom object.) 
		 * 
		 * */
		
		
		
		
//		ApplicationContext context=new AnnotationConfigApplicationContext(ProductConfig.class);
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProductConfig.class);
//		for(String name : context.getBeanDefinitionNames()) {
//			System.out.println("Name :"+name+"isPrototype :"+context.isPrototype(name));
//			System.out.println("bean "+name+"in use ?"+context.isBeanNameInUse(name));
//		}
//		Product product= context.getBean(Product.class);
//		System.out.println(product.hashCode());
//		Product product1= context.getBean(Product.class);
//		System.out.println(product1.hashCode());
		
		Order o1=context.getBean(Order.class);
		System.out.println(o1.hashCode());
		System.out.println(o1.getProduct().hashCode());
		
		Order o2=context.getBean(Order.class);
		System.out.println(o2.hashCode());
		System.out.println(o2.getProduct().hashCode());
	}

}
