package com.alura.jdbc.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection GetConnection() throws SQLException {
		String url = "jdbc:mysql://localhost/stock_control?useTimeZone=true&serverTimeZone=UTC";
		String user = "root";
		String pass = "SECUREPASS";
		return DriverManager.getConnection(url, user, pass);
	}
}
