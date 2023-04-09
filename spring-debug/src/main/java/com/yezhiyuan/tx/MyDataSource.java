package com.yezhiyuan.tx;


import org.springframework.jdbc.datasource.AbstractDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MyDataSource  extends AbstractDataSource {




	String url;
	String user;
	String password;

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public String getUrl() {
		return url;
	}

	public String getUser() {
		return user;
	}


	public MyDataSource(){
		this("jdbc:mysql://124.221.220.128/mybatis-debug","root","y2yhsamysql");
	}

	public MyDataSource(String url, String user, String password){
		this.url=url;
		this.user=user;
		this.password=password;
	}

	@Override
	public Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection(url,user,password);
		return connection;
	}

	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		Connection connection = DriverManager.getConnection(url,user,password);
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