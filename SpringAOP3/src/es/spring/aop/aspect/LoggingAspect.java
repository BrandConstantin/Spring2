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
	
	// create pointcut for getters methods
	@Pointcut("execution(* es.spring.aop.dao.*.get*(..))")
	private void getter() {}
	
	// create pointcut for setter methods
	@Pointcut("execution(* es.spring.aop.dao.*.set*(..))")
	private void setter() {}
	
	// create pointcut include package but exclude getter and setters
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	private void forDaoExcludeGetterAndSetter() {}
	
	@Before("forDaoExcludeGetterAndSetter()") 
	public void beforeAddAccountAdvice() {
		System.out.println(">>> executing @Before with pointcut declaration @Pointcut");
	}
	
	@Before("forDaoExcludeGetterAndSetter()")
	public void performApiAnalytics() {
		System.out.println(">>> executing API analytics");
	}
}
