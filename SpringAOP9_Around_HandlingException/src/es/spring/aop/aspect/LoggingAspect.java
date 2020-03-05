package es.spring.aop.aspect;

import java.util.List;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import es.spring.aop.Account;

@Aspect
@Component
@Order(-3)
public class LoggingAspect {
	private Logger myLogger = Logger.getLogger(getClass().getName());
	
	@Around("execution(* es.spring.aop.service.*.getFortune(..))")
	public Object aroundGetFortune(ProceedingJoinPoint theProceedingJoinPoint) throws Throwable{
		// print out method we are advisin on
		String method = theProceedingJoinPoint.getSignature().toShortString();
		myLogger.info("1. " + method);
		
		// get bengin timestamp
		long begin = System.currentTimeMillis();
		
		// now, let's execute the method
		Object result = null;
		
		try {
			result = theProceedingJoinPoint.proceed();
		} catch (Throwable e) {			
			// log the exception
			myLogger.warning(e.getMessage());
			// give user a custom message
			result = "No worries, everything have a solution";
		}
		
		// get end timestamp
		long end = System.currentTimeMillis();
		
		// compute duration and diplay it
		long duration = end - begin;
		myLogger.info("Duration " + duration / 1000.0 + " seconds;");
		
		return result;
	}
	
	@After("execution(* es.spring.aop.dao.AccountDAO.findAccounts(..))")
	public void afterFinallyFindAccountsAdvice(JoinPoint theJoinPoint) {
		String method = theJoinPoint.getSignature().toShortString();
		myLogger.info("Successfuly done " + method);
	}
	
	@AfterThrowing(pointcut = "execution(* es.spring.aop.dao.AccountDAO.findAccounts(..))",
				throwing = "theExc")
	public void afterThrowingFindAccountAdvice(JoinPoint theJoinPoint, Throwable theExc) {
		// print out with method we are advising on
		String method = theJoinPoint.getSignature().toShortString();
		myLogger.info(method);
		
		// log the exception
		myLogger.info("The exception is " + theExc);
	}
	
	// add a new advice for @AfterReturning on the findAccounts method
	@AfterReturning(pointcut="execution(* es.spring.aop.dao.AccountDAO.findAccounts(..))",
					returning="resultsForAccounts")
	public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint, List<Account> resultsForAccounts) {
		// print out wich method we are advising on
		String method = theJoinPoint.getSignature().toShortString();
		myLogger.info(method);
		
		// print out the result of the method call
		myLogger.info("result is " + resultsForAccounts);
		
		// let's post-process the data and modify it
		// convert the account name to uppercase
		convertAccountNamesToUpperCase(resultsForAccounts);
		myLogger.info(resultsForAccounts.toString());
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
		myLogger.info(">>> executing @Before with pointcut declaration @Pointcut");

		// display the method signature
		MethodSignature methodSign = (MethodSignature) theJoinPoint.getSignature();
		myLogger.info("Method = " + methodSign);
		
		// display method arguments
			// get the args
			Object[] args = theJoinPoint.getArgs();
			// loop thru args
			for(Object tempArg: args) {
				myLogger.info("tempARGS" + tempArg);
				
				if(tempArg instanceof Account) {
					// downcast and print account specific stuff
					Account theAccount = (Account) tempArg;
					myLogger.info("account name " + theAccount.getName()
						+ " and the level " + theAccount.getLevel());
				}
			}
	}
}
