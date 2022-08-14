package com.weshopify.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CustomerTest {
	public static void main(String[] args) {
//		ApplicationContext context=new ClassPathXmlApplicationContext("customer-beans-parameterized-definition-autowire.xml");
//		CustomerBean customerBean= context.getBean(CustomerBean.class);
//		System.out.println(customerBean.getHomeLoanAccount().getLoanAmt());
		
		
//		If @Singleton , the hashcode are same throughout the container.
//		At the below line only the bean is creating so it is a EAGER LOADING which is by default.Then the question is how we can make it as a LAZY ????-> Apply @Lazy
		ApplicationContext container1= new AnnotationConfigApplicationContext(CustomerConfig.class);
		CustomerBean customerBean= container1.getBean(CustomerBean.class);
		System.out.println(customerBean.hashCode());
		System.out.println(customerBean.hashCode());
		System.out.println(customerBean.hashCode());
		System.out.println(customerBean.hashCode());
		System.out.println("===============================================================================================");
//		ApplicationContext container2= new AnnotationConfigApplicationContext(CustomerConfig.class);
//		CustomerBean customerBean1= container2.getBean(CustomerBean.class);
//		System.out.println(customerBean1.hashCode());
//		System.out.println(customerBean1.hashCode());
//		System.out.println(customerBean1.hashCode());
//		System.out.println(customerBean1.hashCode());
		
		
//		In Circular reference problem the @Lazy instatiation is at the dependent level(Here in CustomerBean class) 
		
		
		
		
	}

}
