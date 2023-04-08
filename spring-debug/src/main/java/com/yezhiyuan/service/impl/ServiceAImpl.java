package com.yezhiyuan.service.impl;


import com.yezhiyuan.service.ServiceA;
import com.yezhiyuan.service.ServiceB;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.annotation.Resource;

@Service
public class ServiceAImpl implements ServiceA {


	@Resource
	ServiceB serviceB;

	@Resource
	public void testResourceMethod(ServiceB serviceB){

	}

	@Resource(name = "dataSourceTransactionManager")
	DataSourceTransactionManager transactionManager;

	@Transactional
	@Override
	public void doSomething() {

		System.out.println(transactionManager);

//		transactionManager.setDataSource();
//		DefaultTransactionDefinition transDefinition = new DefaultTransactionDefinition();
//		//开启新事物                transDefinition.setPropagationBehavior(DefaultTransactionDefinition.PROPAGATION_REQUIRES_NEW);
//
//		TransactionStatus transStatus = transactionManager.getTransaction(transDefinition);
//
//
//
//		transactionManager.commit(transStatus);

		System.out.println("service A doSomething");
	}
}
