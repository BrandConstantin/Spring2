package es.spring.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	public boolean addAccountMembership() {
		System.out.println(getClass() + " doing adding membership accounts");
		return true;
	}
}
