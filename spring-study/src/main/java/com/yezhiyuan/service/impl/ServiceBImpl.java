package com.yezhiyuan.service.impl;

import com.yezhiyuan.service.ServiceA;
import com.yezhiyuan.service.ServiceB;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Transactional
@Service
public class ServiceBImpl implements ServiceB {

	@Resource
	ServiceA serviceA;


	@Transactional
	public void testTransactionalProxy(){}

	@PostConstruct
	public void testPostConstruct(){
		System.out.println("testPostConstruct执行了");
	}

	@PostConstruct
	public void testPostConstruct2(){
		System.out.println("testPostConstruct2执行了");
	}
}
