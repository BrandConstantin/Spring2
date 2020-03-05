package es.spring.aop.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import es.spring.aop.Account;

@Aspect
@Component
@Order(-3)
public class LoggingAspect {
	@AfterThrowing(pointcut = "execution(* es.spring.aop.dao.AccountDAO.findAccounts(..))",
				throwing = "theExc")
	public void afterThrowingFindAccountAdvice(JoinPoint theJoinPoint, Throwable theExc) {
		// print out with method we are advising on
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println(method);
		
		// log the exception
		System.out.println("The exception is " + theExc);
	}
	
	// add a new advice for @AfterReturning on the findAccounts method
	@AfterReturning(pointcut="execution(* es.spring.aop.dao.AccountDAO.findAccounts(..))",
					returning="resultsForAccounts")
	public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint, List<Account> resultsForAccounts) {
		// print out wich method we are advising on
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println(method);
		
		// print out the result of the method call
		System.out.println("result is " + resultsForAccounts);
		
		// let's post-process the data and modify it
		// convert the account name to uppercase
		convertAccountNamesToUpperCase(resultsForAccounts);
		System.out.println(resultsForAccounts);
	}
	
	private void convertAccountNamesToUpperCase(List<Account> resultsForAccounts) {
		// loop through accounts
		for(Account tempAccount : resultsForAccounts) {
			// get uppercase version of name
			String theUpperName = tempAccount.getName().toUpperCase();
			
			// update the name of the account
			tempAccount.setName(theUpperName);
		}
	}

	@Before("es.spring.aop.aspect.ExpressionsAspect.forDaoExcludeGetterAndSetter()")
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
		System.out.println(">>> executing @Before with pointcut declaration @Pointcut");

		// display the method signature
		MethodSignature methodSign = (MethodSignature) theJoinPoint.getSignature();
		System.out.println("Method = " + methodSign);
		
		// display method arguments
			// get the args
			Object[] args = theJoinPoint.getArgs();
			// loop thru args
			for(Object tempArg: args) {
				System.out.println(tempArg);
				
				if(tempArg instanceof Account) {
					// downcast and print account specific stuff
					Account theAccount = (Account) tempArg;
					System.out.println("account name " + theAccount.getName()
						+ " and the level " + theAccount.getLevel());
				}
			}
	}
}
