package com.weshopify.core.primaryAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DataSourceConfigTest {

	public static void main(String[] args) {
		/*
		 * In this project we can use primary annotation by three ways,
		 * 1. -> Make BasicDataSource[BDS] and DriverManagarDataSource[DMDS] as a @Bean
		 * 	  -> Make Anyone Bean as a @Primary
		 * 	  -> Make Property file has a @Configuration
		 * 	  -> getBean(Interface) which will call the @Primary bydefault but if we give the bean name like [@Bean(name="something")], we can pass "something" into the getBean and we can access the specified bean.
		 * 
		 * 2. -> We can create a class called CustomerRepo which will @Autowired the Interface[DataSource] + create a method which call the interface method[initconnection()].
		 * 	  -> Make CustomerRepo to @Component and add @ComponentScan to property file.
		 * 	  -> getBean(CustmerRepo) call into Test file.
		 * 
		 * 3. -> @Primary use at class level [two class extends or implements the same class or interface]
		 * 	  -> Add @Component(value="something") to access the specific spring bean
		 * 	  -> Add @Qualifier into CustomerRepo autowired interface to specifically call the DataSource.
		 * 	  -> Rmember we need to call the no-arg customer in both the DataSorces.
		 * */
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(DataSourceConfig.class);
//		DataSource ds=applicationContext.getBean(DataSource.class);
		
//		DataSource ds=applicationContext.getBean("postgres",DataSource.class);
//		ds.initconnection();

		CustomerRepo customerRepo= applicationContext.getBean(CustomerRepo.class);
		customerRepo.saveCustomer();
	}
}
