package es.spring.aop.dao;

import org.springframework.stereotype.Component;

import es.spring.aop.Account;

@Component
public class AccountDAO {
	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(getClass() + " doing the add account");
	}
	
	public boolean doWork() {
		System.out.println("Do you work?");
		return false;
	}
}
