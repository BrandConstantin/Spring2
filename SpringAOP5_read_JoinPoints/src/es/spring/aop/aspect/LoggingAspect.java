package es.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
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
