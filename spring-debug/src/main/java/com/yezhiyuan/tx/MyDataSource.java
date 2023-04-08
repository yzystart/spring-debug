package com.yezhiyuan.tx;


import org.springframework.jdbc.datasource.AbstractDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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

	public static void main(String[] args) {
		Connection connection = DriverManager.getConnection("jdbc:mysql://124.221.220.128/mybatis-debug","root","y2yhsamysql");

	}
}