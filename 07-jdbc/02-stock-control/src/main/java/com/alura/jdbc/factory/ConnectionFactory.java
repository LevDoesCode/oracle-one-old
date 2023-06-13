package com.alura.jdbc.factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

	private DataSource dataSource;

	public ConnectionFactory() {
		var pooledDataSource = new ComboPooledDataSource();
		String url = "jdbc:mysql://localhost/stock_control?useTimeZone=true&serverTimeZone=UTC";
		String user = "root";
		String pass = "SECUREPASS";
		pooledDataSource.setJdbcUrl(url);
		pooledDataSource.setUser(user);
		pooledDataSource.setPassword(pass);
		pooledDataSource.setMaxPoolSize(10);
		this.dataSource = pooledDataSource;
	}

	public Connection GetConnection() throws SQLException {
		return this.dataSource.getConnection();
	}
}
