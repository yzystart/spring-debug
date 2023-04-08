package com.yezhiyuan.config;


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



	@Qualifier("myDataSource")
	@Bean
	public TransactionManager dataSourceTransactionManager(DataSource datasource){
		return new DataSourceTransactionManager(datasource);
	}

	@Bean("myDataSource")
	public DataSource myDataSource(){
		return new MyDataSource();
	}

}
