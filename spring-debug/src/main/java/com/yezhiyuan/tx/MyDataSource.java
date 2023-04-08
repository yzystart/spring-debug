package com.yezhiyuan.tx;


import org.springframework.jdbc.datasource.AbstractDataSource;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyDataSource  extends AbstractDataSource {

	@Override
	public Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://124.221.220.128/mybatis-debug","root","y2yhsamysql");
		return connection;
	}

	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://124.221.220.128/mybatis-debug","root","y2yhsamysql");
		return connection;
	}

//	public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
//		Driver driver = new com.mysql.jdbc.Driver();
//		String url = "jdbc:mysql://124.221.220.128/mybatis-debug?useUnicode=true&characterEncoding=utf8";
//		//3.将数据库的用户名和密码封装在Properties中
//		Properties info = new Properties();
//		info.setProperty("user", "root");
//		info.setProperty("password", "y2yhsamysql");
//		//4.调用driver的connect()，获取连接
//		Connection conn = driver.connect(url, info);
//		System.out.println();
//	}
}