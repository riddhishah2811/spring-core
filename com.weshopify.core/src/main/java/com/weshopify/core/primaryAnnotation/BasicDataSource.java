package com.weshopify.core.primaryAnnotation;

import org.springframework.stereotype.Component;

@Component(value="postgres")
public class BasicDataSource implements DataSource{
	
	private String uname;
	private String pass;
	private String url;
	private String driverClassName;
	public BasicDataSource() {
		// TODO Auto-generated constructor stub
	}
	public BasicDataSource(String uname, String pass, String url, String driverClassName) {
		super();
		this.uname = uname;
		this.pass = pass;
		this.url = url;
		this.driverClassName = driverClassName;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDriverClassName() {
		return driverClassName;
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	public void initConnection(String driverName, String url, String uname, String pass) {
		// TODO Auto-generated method stub
		
	}
	
	public void initconnection() {
		System.out.println("Connecting DB through Basic Datasource .");
	}
	


}
