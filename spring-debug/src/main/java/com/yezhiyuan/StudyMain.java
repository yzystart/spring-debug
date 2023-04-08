package com.yezhiyuan;

import com.yezhiyuan.aoptest.TestAopService;
import com.yezhiyuan.imports.MyImportBean;
import com.yezhiyuan.service.impl.ServiceBImpl;
import org.springframework.aop.framework.AdvisedSupport;
import org.springframework.aop.framework.CglibAopProxy;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.HashSet;
import java.util.Map;

@Import(MyImportBean.class)
@Component
@EnableTransactionManagement(proxyTargetClass = true)
//@ComponentScan({"com.yezhiyuan.service.impl","com.yezhiyuan.bean","com.yezhiyuan.config"})

@ComponentScan({"com.yezhiyuan"})
@EnableAspectJAutoProxy
public class StudyMain{


	public static void main(String[] args) {
//		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(StudyMain.class);
//		ConfigurableListableBeanFactory beanFactory = applicationContext.getBeanFactory();
//		System.out.println();
//		TestAopService t = beanFactory.getBean(TestAopService.class);
		AdvisedSupport advisedSupport = new AdvisedSupport();
		advisedSupport.setTarget(new TestAopService());
		CglibAopProxy cglibAopProxy = new CglibAopProxy(advisedSupport);
		Object proxy = cglibAopProxy.getProxy();
//		t.doSomething();
//		System.out.println(serviceBImpl.serviceA);
//		serviceBImpl.testTransactionalProxy();
//		System.out.println("end");
//		HashSet bean = beanFactory.getBean(HashSet.class);
//		System.out.println(bean);
	}

}
