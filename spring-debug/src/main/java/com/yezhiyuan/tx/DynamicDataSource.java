package com.yezhiyuan.tx;


import com.yezhiyuan.config.DataSourceHolder;
import org.springframework.jdbc.datasource.AbstractDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DynamicDataSource  extends AbstractDataSource {


	@Override
	public Connection getConnection() throws SQLException {
		return DataSourceHolder.getCurrentDataSource().getConnection();
	}

	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		return DataSourceHolder.getCurrentDataSource().getConnection();
	}
}
