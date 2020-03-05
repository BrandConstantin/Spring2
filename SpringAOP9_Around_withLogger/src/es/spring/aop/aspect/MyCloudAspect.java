package es.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyCloudAspect {
	@Before("es.spring.aop.aspect.ExpressionsAspect.forDaoExcludeGetterAndSetter()")
	public void loginToCloud() {
		System.out.println(">>> executing login to Cloud in async");
	}
}
