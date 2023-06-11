package com.alura.jdbc.pruebas;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.alura.jdbc.factory.ConnectionFactory;

public class PruebaDelete {
	public static void main(String[] args) throws SQLException {
		Connection conn = new ConnectionFactory().GetConnection();
		Statement statement = conn.createStatement();
		String query1 = "DELETE FROM products WHERE ID = 99";
		statement.execute(query1);
		int updateCount = statement.getUpdateCount();
		System.out.println(updateCount);
	}
}
