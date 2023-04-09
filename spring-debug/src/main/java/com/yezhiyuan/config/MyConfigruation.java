package com.yezhiyuan.config;


import com.yezhiyuan.tx.DynamicDataSource;
import com.yezhiyuan.tx.MyDataSource;
import com.yezhiyuan.tx.MyTransactionManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.*;
import org.springframework.transaction.support.AbstractPlatformTransactionManager;
import org.springframework.transaction.support.DefaultTransactionStatus;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Optional;
import java.util.logging.Logger;

@Configuration
public class MyConfigruation {



	@Qualifier("dynamicDataSource")
	@Bean
	public TransactionManager dataSourceTransactionManager(DataSource dynamicDataSource){
		return new DataSourceTransactionManager(dynamicDataSource);
	}


	@Bean("dynamicDataSource")
	public DataSource dynamicDataSource(){
		return new DynamicDataSource();
	}

//	@Bean("myDataSource")
//	public DataSource myDataSource(){
//		return new MyDataSource("jdbc:mysql://124.221.220.128/mybatis-debug","root","y2yhsamysql");
//	}

	@Bean("db2")
	public DataSource db2(){
		MyDataSource myDataSource = new MyDataSource("jdbc:mysql://124.221.220.128/db2", "root", "y2yhsamysql");
		DataSourceHolder.datasourceMap.put("db2",myDataSource);
		return myDataSource;
	}

	@Bean("db1")
	public DataSource db1(){
		MyDataSource myDataSource = new MyDataSource("jdbc:mysql://124.221.220.128/db1", "root", "y2yhsamysql");
		DataSourceHolder.datasourceMap.put("db1",myDataSource);
		return myDataSource;}

}
