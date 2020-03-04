package es.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	// this is where add all of our related advices for logging
	// start with @Before advice
	//@Before("execution(public void addAccount())") // match addAccount() method in any class
	//@Before("execution(public void es.spring.aop.dao.AccountDAO.addAccount())") // match only addAccount method for this specific class
	@Before("execution(public void add*())") // match any add* method
	public void beforeAddAccountAdvice() {
		System.out.println(">>> executing @Before");
	}
}
