package com.weshopify.core.circularreferencesolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CustomerBean {
	private int id=1233;
	private String name="Mr. Spider";
	
	private HomeLoanAccount homeLoanAccount;
	
	@Autowired
	public CustomerBean(HomeLoanAccount homeLoanAccount) {
		this.homeLoanAccount=homeLoanAccount;
	}
	
	public CustomerBean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public HomeLoanAccount getHomeLoanAccount() {
		return homeLoanAccount;
	}
	
	

}
