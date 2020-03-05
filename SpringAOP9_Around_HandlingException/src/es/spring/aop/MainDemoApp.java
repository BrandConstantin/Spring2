package es.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.spring.aop.dao.AccountDAO;
import es.spring.aop.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		// get membership bean from srping container
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		
		// call the business method
		Account myAccount = new Account();
		myAccount.setLevel("3");
		myAccount.setName("ThreeX");
		theAccountDAO.addAccount(myAccount, true);
		theAccountDAO.doWork();
		
		// call the accountdao setters and getters methods
		theAccountDAO.setName("Carmen");
		theAccountDAO.setServiceCode("C-Nemra");
		String name = theAccountDAO.getName();
		String code = theAccountDAO.getServiceCode();
		
		// call the membership method
		theMembershipDAO.addAccountMembership();
		theMembershipDAO.goToSleep();
		
		// close the context
		context.close();
	}

}
