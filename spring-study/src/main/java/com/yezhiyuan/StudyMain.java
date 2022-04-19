package com.yezhiyuan;

import com.yezhiyuan.imports.MyImportBean;
import com.yezhiyuan.service.impl.ServiceAImpl;
import com.yezhiyuan.support.MyBeanPostProcessor;
import org.aopalliance.aop.Advice;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Import(MyImportBean.class)
@Component
@ComponentScan("com.yezhiyuan.service.impl")
public class StudyMain implements PointcutAdvisor {
	public static class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

		public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
			return new ServiceAImpl();
		}
	}

	@Bean
	public MyInstantiationAwareBeanPostProcessor mm(){
		return new MyInstantiationAwareBeanPostProcessor();
	}


	public static void main(String[] args) throws InterruptedException {
//		ThreadLocal<String>l=new ThreadLocal<>();
////		l.set("测试！");
//		System.out.println("造");
//		System.gc();
//		Thread.sleep(1000L);
//		System.out.println(l.get());
		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(StudyMain.class);
		MyBeanPostProcessor bean = applicationContext.getBean(MyBeanPostProcessor.class);
		System.out.println(bean);
	}

	@Override
	public Advice getAdvice() {
		return null;
	}

	@Override
	public boolean isPerInstance() {
		return false;
	}

	@Override
	public Pointcut getPointcut() {
		return null;
	}
}
