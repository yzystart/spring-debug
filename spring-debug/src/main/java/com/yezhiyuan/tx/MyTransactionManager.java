package com.yezhiyuan.tx;

import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.support.AbstractPlatformTransactionManager;
import org.springframework.transaction.support.DefaultTransactionStatus;

public class MyTransactionManager extends AbstractPlatformTransactionManager {

	private static final long serialVersionUID = 6807380416709738310L;
	@Override
	protected Object doGetTransaction() throws TransactionException {
		return null;
	}

	@Override
	protected void doBegin(Object transaction, TransactionDefinition definition) throws TransactionException {
		System.out.println("执行了开启事务");
	}

	@Override
	protected void doCommit(DefaultTransactionStatus status) throws TransactionException {
		System.out.println("执行了提交事务");
	}

	@Override
	protected void doRollback(DefaultTransactionStatus status) throws TransactionException {
		System.out.println("执行了回滚事务");
	}
}