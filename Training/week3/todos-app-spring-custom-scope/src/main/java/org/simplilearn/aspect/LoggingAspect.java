package org.simplilearn.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Before("execution(* com.simplilearn.service.TodoServiceImpl.*(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("Executing method: " + joinPoint.getSignature().getName());
	}

	@AfterReturning(pointcut = "execution(* com.simplilearn.service.TodoServiceImpl.*(..))", returning = "result")
	public void logAfter(JoinPoint joinPoint, Object result) {
		System.out.println("Completed method: " + joinPoint.getSignature().getName() + "with result: " + result);

	}
}


