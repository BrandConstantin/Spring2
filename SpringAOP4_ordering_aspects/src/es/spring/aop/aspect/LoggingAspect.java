package es.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(-3)
public class LoggingAspect {
	@Before("es.spring.aop.aspect.ExpressionsAspect.forDaoExcludeGetterAndSetter()") 
	public void beforeAddAccountAdvice() {
		System.out.println(">>> executing @Before with pointcut declaration @Pointcut");
	}
	
}
