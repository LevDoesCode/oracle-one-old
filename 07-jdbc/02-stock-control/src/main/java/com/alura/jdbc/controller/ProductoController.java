package com.alura.jdbc.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alura.jdbc.factory.ConnectionFactory;

public class ProductoController {

	public void modificar(String nombre, String descripcion, Integer id) {
		// TODO
	}

	public void eliminar(Integer id) {
		// TODO
	}

	public List<Map<String, String>> listar() throws SQLException {
		Connection conn = new ConnectionFactory().GetConnection();

		Statement statement = conn.createStatement();
		String query1 = "SELECT ID, NAME, DESCRIPTION, QUANTITY FROM PRODUCTS";
		boolean executeResult = statement.execute(query1); // true if we got a list as a result

		ResultSet resultSet = statement.getResultSet();
		List<Map<String, String>> result = new ArrayList<>();

		while (resultSet.next()) {
			// resultSet.getInt(0); // Same as using "ID"
			Map<String, String> row = new HashMap<>();
			row.put("ID", String.valueOf(resultSet.getInt("ID")));
			row.put("NAME", String.valueOf(resultSet.getString("NAME")));
			row.put("DESCRIPTION", String.valueOf(resultSet.getString("DESCRIPTION")));
			row.put("QUANTITY", String.valueOf(resultSet.getInt("QUANTITY")));
			result.add(row);
		}

		System.out.println(result);

		conn.close();
		return result;
	}

	public void guardar(Map<String, String> producto) throws SQLException {
		Connection conn = new ConnectionFactory().GetConnection();

		Statement statement = conn.createStatement();

		statement.execute(
				"INSERT INTO products (name, description, quantity) " + " VALUES('" + producto.get("NAME") + "', '"
						+ producto.get("DESCRIPTION") + "', " + producto.get("QUANTITY") + ")",
				Statement.RETURN_GENERATED_KEYS);

		ResultSet result = statement.getGeneratedKeys();

		while (result.next()) {
			System.out.println(String.format("Inserted with ID %d", result.getInt(1)));
		}
	}

}
