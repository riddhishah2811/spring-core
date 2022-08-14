package com.weshopify.core;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/* @Autowired will be work on as a field, setter method(constructor is commented) and constructor level(setter is commented)*/
/*@Atowired is by default not enabled, so ew have to use the <context:annotation-config> and add the xmlns for context of a perticular version. */
@Component
@Lazy
public class CustomerBean implements Serializable {
	
	public CustomerBean() {
		System.out.println("Started Creating Customer Spring Bean");
	}

	/**
	 * 
	 */
	@Autowired
	private HomeLoanAccount homeLoanAccount;
	
	
	private PersonalLoanAccount personalLoanAccount;
	
//	This constructor is for autowwire="constructor" in <bean></bean>
//	With @Autowired annotation at constructor level
//	@Autowired
//	public CustomerBean(HomeLoanAccount homeLoanAccount) {
//		super();
//		this.homeLoanAccount = homeLoanAccount;
//	}

	public HomeLoanAccount getHomeLoanAccount() {
		return homeLoanAccount;
	}

	public PersonalLoanAccount getPersonalLoanAccount() {
		return personalLoanAccount;
	}

//	If we apply the autowiring at the setter level we can able to print the data into the setMethod()
	@Autowired
	public void setPersonalLoanAccount(PersonalLoanAccount personalLoanAccount) {
		System.out.println("Injecting the personal Loan Account into the Customer Spring Bean");
		this.personalLoanAccount = personalLoanAccount;
	}

//	With @Autowired annotation at method level
//	@Autowired	
//	public void setHomeLoanAccount(HomeLoanAccount homeLoanAccount) {
//		this.homeLoanAccount = homeLoanAccount;
//	}

	
}
