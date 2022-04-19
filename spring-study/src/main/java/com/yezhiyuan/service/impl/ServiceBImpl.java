package com.yezhiyuan.service.impl;

import com.yezhiyuan.service.ServiceA;
import com.yezhiyuan.service.ServiceB;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ServiceBImpl implements ServiceB {

	@Resource
	ServiceA serviceA;
}
