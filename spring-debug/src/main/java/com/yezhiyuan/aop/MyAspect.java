package com.yezhiyuan.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {



	@Before("@annotation(com.yezhiyuan.annotation.MyAnnotation)")
	public void before(JoinPoint joinPoint) throws Throwable {
		System.out.println(" ss ");
	}

}
