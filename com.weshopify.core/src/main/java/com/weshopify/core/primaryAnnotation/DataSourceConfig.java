package com.weshopify.core.primaryAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.weshopify.core.primaryAnnotation")
public class DataSourceConfig {
	
//	More than one bean of same type , we can use @Primary annotation for Primary Bean.
//	@Bean
//	@Primary // @Primary annotation at method level. 
//	public DataSource mysqlDB() {
//		return new DriverMnagerDatasource("root", "root","jdbc:mysql://localhost:3306/shopifyMe","com.mysql.jdbc.Driver");
//	}
//
//	@Bean(name="postgres")
//	public DataSource postgresDB() {
//		return new BasicDataSource("postgres", "postgres","jdbc:postgres://localhost:5431/shopifyMe",  "com.postgres.jdbc.Driver");
//	}
}
