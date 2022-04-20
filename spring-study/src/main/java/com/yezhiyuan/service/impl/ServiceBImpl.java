package com.yezhiyuan.service.impl;

import com.yezhiyuan.service.ServiceA;
import com.yezhiyuan.service.ServiceB;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

//@Transactional
@Service
public class ServiceBImpl implements ServiceB {

	@Resource
	public ServiceA serviceA;


	@Transactional(rollbackFor = NullPointerException.class)
	public void testTransactionalProxy(){
		System.out.println(".........");
		serviceA.doSomething();
//		throw new NullPointerException();
	}

	@PostConstruct
	public void testPostConstruct(){
		System.out.println("testPostConstruct执行了");
	}

	@PostConstruct
	public void testPostConstruct2(){
		System.out.println("testPostConstruct2执行了");
	}
}
