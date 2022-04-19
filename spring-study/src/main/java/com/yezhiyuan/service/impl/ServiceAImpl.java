package com.yezhiyuan.service.impl;


import com.yezhiyuan.service.ServiceA;
import com.yezhiyuan.service.ServiceB;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Aspect
public class ServiceAImpl implements ServiceA {


	@Resource
	ServiceB serviceB;

	@Resource
	public void testResourceMethod(ServiceB serviceB){

	}

}
