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
		System.out.println(">> getName");
		return name;
	}

	public String getServiceCode() {
		System.out.println(">> getServiceCode");
		return serviceCode;
	}

	public void setName(String name) {
		System.out.println(">> setName");
		this.name = name;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(">> setServiceCode");
		this.serviceCode = serviceCode;
	}
	
}
