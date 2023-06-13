package com.alura.jdbc.pruebas;

import java.sql.Connection;
import java.sql.SQLException;

import com.alura.jdbc.factory.ConnectionFactory;

public class PruebaPoolConn {
	public static void main(String[] args) throws SQLException {
		ConnectionFactory connFact = new ConnectionFactory();

		for (int i = 0; i < 20; i++) {
			Connection conn = connFact.GetConnection();
			System.out.println("Opening connection #: " + (i + 1));
		}
	}
}
