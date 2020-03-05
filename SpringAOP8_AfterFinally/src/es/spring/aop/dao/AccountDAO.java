package es.spring.aop.dao;

import java.util.ArrayList;
import java.util.List;

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
	
	// add a new method findAccounts()
	public List<Account> findAccounts(boolean tripWire){
		// simulate an exception
		if(tripWire) {
			throw new RuntimeException("Throw the throwing!");
		}
		
		List<Account> myAccounts = new ArrayList<>();
		
		// create sample accounts
		Account temp1 = new Account("Karim", "Silver");
		Account temp2 = new Account("Olvier", "Platinum");
		Account temp3 = new Account("Luca", "Gold");

		// add them to our accounts list
		myAccounts.add(temp1);
		myAccounts.add(temp2);
		myAccounts.add(temp3);
		return myAccounts;
	}
}
