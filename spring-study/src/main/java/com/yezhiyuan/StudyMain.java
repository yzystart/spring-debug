package com.yezhiyuan;

import com.yezhiyuan.imports.MyImportBean;
import com.yezhiyuan.service.ServiceA;
import com.yezhiyuan.support.MyBeanPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Import(MyImportBean.class)
@Component
@ComponentScan("com.yezhiyuan.service.impl")
public class StudyMain {


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
}
