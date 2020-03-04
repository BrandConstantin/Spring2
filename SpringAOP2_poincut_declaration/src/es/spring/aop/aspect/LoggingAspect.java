package es.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	@Pointcut("execution(* es.spring.aop.dao.*.*(..))")
	private void forDaoPackage() {}
	
	@Before("forDaoPackage()") 
	public void beforeAddAccountAdvice() {
		System.out.println(">>> executing @Before with pointcut declaration @Pointcut");
	}
	
	@Before("forDaoPackage()")
	public void performApiAnalytics() {
		System.out.println(">>> executing API analytics");
	}
}
