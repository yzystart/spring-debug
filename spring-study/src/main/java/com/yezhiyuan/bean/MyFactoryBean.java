package com.yezhiyuan.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

//@Component
public class MyFactoryBean implements FactoryBean<MyBean> {

	@Override
	public MyBean getObject() {
		System.out.println("MyFactoryBean getObject 执行了。");
		return new MyBean();
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("MyFactoryBean getObjectType 执行了。");
		return MyBean.class;
	}
}
