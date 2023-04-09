package com.yezhiyuan.service.impl;


import com.yezhiyuan.annotation.DB;
import com.yezhiyuan.service.ServiceA;
import com.yezhiyuan.service.ServiceB;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	@DB("db2")
	@Override
	public void doSomething2() {
		System.out.println("调用了doSomething2");
	}


	@Transactional
	@DB("db1")
	@Override
	public void doSomething() {
		System.out.println("调用了doSomething");


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
