package es.spring.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	public boolean addAccountMembership() {
		System.out.println(getClass() + " doing adding membership accounts");
		return true;
	}
	
	public void goToSleep() {
		System.out.println("If you don't work, go to sleep!");
	}
}
