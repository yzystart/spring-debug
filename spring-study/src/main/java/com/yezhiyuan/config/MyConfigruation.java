package com.yezhiyuan.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.*;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

@Configuration
public class MyConfigruation {


	@Bean
	public TransactionManager dataSourceTransactionManager(DataSource datasource){
//		DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager(datasource);
//		return new MyTransactionManager();
		return new MyTransactionManager();
	}

	@Bean
	public DataSource dataSource(){
		return new MyDataSource();
	}

	class MyDataSource implements DataSource{

		@Override
		public Connection getConnection() throws SQLException {
//			return new JDBCColl;
			return null;
		}

		@Override
		public Connection getConnection(String username, String password) throws SQLException {
			return null;
		}

		@Override
		public <T> T unwrap(Class<T> iface) throws SQLException {
			return null;
		}

		@Override
		public boolean isWrapperFor(Class<?> iface) throws SQLException {
			return false;
		}

		@Override
		public PrintWriter getLogWriter() throws SQLException {
			return null;
		}

		@Override
		public void setLogWriter(PrintWriter out) throws SQLException {

		}

		@Override
		public void setLoginTimeout(int seconds) throws SQLException {

		}

		@Override
		public int getLoginTimeout() throws SQLException {
			return 0;
		}

		@Override
		public Logger getParentLogger() throws SQLFeatureNotSupportedException {
			return null;
		}
	}

	class MyTransactionStatus implements TransactionStatus{
		TransactionDefinition definition;
		public MyTransactionStatus(TransactionDefinition definition) {
			this.definition=definition;
		}

		@Override
		public Object createSavepoint() throws TransactionException {
			return new Object();
		}

		@Override
		public void rollbackToSavepoint(Object savepoint) throws TransactionException {
			System.out.println("????????? rollbackToSavepoint"+savepoint);
		}

		@Override
		public void releaseSavepoint(Object savepoint) throws TransactionException {
			System.out.println("????????? releaseSavepoint"+savepoint);
		}

		@Override
		public boolean isNewTransaction() {
			return false;
		}

		@Override
		public void setRollbackOnly() {

		}

		@Override
		public boolean isRollbackOnly() {
			return definition.isReadOnly();
		}

		@Override
		public boolean isCompleted() {
			return false;
		}

		@Override
		public boolean hasSavepoint() {
			return false;
		}

		@Override
		public void flush() {

		}
	}


	class MyTransactionManager implements PlatformTransactionManager {


		@Override
		public TransactionStatus getTransaction(TransactionDefinition definition) throws TransactionException {
			return new MyTransactionStatus(definition);
		}

		@Override
		public void commit(TransactionStatus status) throws TransactionException {

		}

		@Override
		public void rollback(TransactionStatus status) throws TransactionException {
			System.out.println("status\n"+status);
			System.out.println("?????????rollback");
		}
	}
}
