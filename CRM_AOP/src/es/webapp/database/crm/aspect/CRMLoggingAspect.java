package es.webapp.database.crm.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
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
	}
	// add @AfterReturning advice
}
