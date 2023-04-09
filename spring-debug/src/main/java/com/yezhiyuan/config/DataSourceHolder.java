package com.yezhiyuan.config;

import com.yezhiyuan.tx.MyDataSource;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.ConcurrentHashMap;

public class DataSourceHolder {


	private static ThreadLocal<MyDataSource> currentDataSource = new ThreadLocal<>();
	public static ConcurrentHashMap<String,MyDataSource>datasourceMap=new ConcurrentHashMap<>();


	public static MyDataSource getCurrentDataSource()   {
		MyDataSource myDataSource = currentDataSource.get();
		return myDataSource!=null?myDataSource: new MyDataSource("jdbc:mysql://124.221.220.128/mybatis-debug","root","y2yhsamysql");
	}

	public static void setCurrentDataSource(MyDataSource dataSource){
		 currentDataSource.set(dataSource);
	}

}
