package es.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(200)
public class ExpressionsAspect {
	@Pointcut("execution(* es.spring.aop.dao.*.*(..))")
	public void forDaoPackage() {}
	
	// create pointcut for getters methods
	@Pointcut("execution(* es.spring.aop.dao.*.get*(..))")
	public void getter() {}
	
	// create pointcut for setter methods
	@Pointcut("execution(* es.spring.aop.dao.*.set*(..))")
	public void setter() {}
	
	// create pointcut include package but exclude getter and setters
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void forDaoExcludeGetterAndSetter() {}
}
