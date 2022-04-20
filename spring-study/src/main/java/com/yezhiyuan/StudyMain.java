package com.yezhiyuan;

import com.yezhiyuan.bean.MyBean;
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
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Import(MyImportBean.class)
@Component
@EnableTransactionManagement
@ComponentScan({"com.yezhiyuan.service.impl","com.yezhiyuan.bean"})
public class StudyMain implements PointcutAdvisor {
	public static class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

		public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
			return null;
		}
	}

	@Bean
	public MyInstantiationAwareBeanPostProcessor mm(){
		return new MyInstantiationAwareBeanPostProcessor();
	}


	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(StudyMain.class);
		MyBean bean = applicationContext.getBean(MyBean.class);
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
