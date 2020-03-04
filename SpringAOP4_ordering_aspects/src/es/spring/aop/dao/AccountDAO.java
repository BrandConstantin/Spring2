package es.spring.aop.dao;

import org.springframework.stereotype.Component;

import es.spring.aop.Account;

@Component
public class AccountDAO {
	private String name;
	private String serviceCode;
	
	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(getClass() + " doing the add account");
	}
	
	public boolean doWork() {
		System.out.println("Do you work?");
		return false;
	}

	public String getName() {
		return name;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	
}
