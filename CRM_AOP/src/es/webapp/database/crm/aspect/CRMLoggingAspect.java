package es.webapp.database.crm.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLoggingAspect {
	// setup logger
	private Logger myLogger = Logger.getLogger(getClass().getName());
	
	// setup pointcut declarations
	@Pointcut("execution(* es.webapp.database.crm.controller.*.*(..))")
	private void forControllerPackege() {}

	@Pointcut("execution(* es.webapp.database.crm.service.*.*(..))")
	private void forServicePackege() {}
	
	@Pointcut("execution(* es.webapp.database.crm.dao.*.*(..))")
	private void forDaoPackege() {}
	
	@Pointcut("forControllerPackege() || forServicePackege() || forDaoPackege()")
	private void forAppFlow() {}
	
	// add @Before advice
	@Before("forAppFlow()")
	public void before(JoinPoint theJoinPoint) {
		// display method we are calling
		String theMethod = theJoinPoint.getSignature().toShortString();
		myLogger.info("@Before calling method >> " + theMethod);
		
		// display the arguments to the method
		Object[] args = theJoinPoint.getArgs();
		
		// loop thru and display args
		for(Object tempArgs : args) {
			myLogger.info("ARGUMENTS: " + tempArgs);
		}
	}
	
	// add @AfterReturning advice
	@AfterReturning(pointcut = "forAppFlow()",
					returning = "theResult")
	public void afterReturning(JoinPoint theJoinPoint, Object theResult) {
		// display method we are returning from
		String theMethod = theJoinPoint.getSignature().toShortString();
		myLogger.info("@After returning from method >> " + theMethod);
		
		// display data returned
		myLogger.info("THE RESULT " + theResult);
	}
}
