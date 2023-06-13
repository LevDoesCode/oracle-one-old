package com.alura.jdbc.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alura.jdbc.dao.ProductDAO;
import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.model.Product;

public class ProductoController {

	public int modificar(String nombre, String descripcion, Integer cantidad, Integer id) throws SQLException {
		final Connection conn = new ConnectionFactory().GetConnection();

		try (conn) {
			final PreparedStatement statement = conn.prepareStatement(
					"UPDATE products SET " + "NAME = ?, " + "DESCRIPTION = ?," + "QUANTITY = ? " + "WHERE ID = ?");

			try (statement) {
				statement.setString(1, nombre);
				statement.setString(2, descripcion);
				statement.setInt(3, cantidad);
				statement.setInt(4, id);
				int updateCount = statement.getUpdateCount();
				return updateCount;
			}
		}
	}

	public int eliminar(Integer id) throws SQLException {
		final Connection conn = new ConnectionFactory().GetConnection();

		try (conn) {
			final PreparedStatement statement = conn.prepareStatement("DELETE FROM products WHERE ID = ?");

			try (statement) {
				statement.setInt(1, id);
				statement.execute();
				int updateCount = statement.getUpdateCount();
				return updateCount;
			}
		}
	}

	public List<Map<String, String>> listar() throws SQLException {
		final Connection conn = new ConnectionFactory().GetConnection();

		try (conn) {
			final PreparedStatement statement = conn
					.prepareStatement("SELECT ID, NAME, DESCRIPTION, QUANTITY FROM PRODUCTS");

			try (statement) {
				boolean executeResult = statement.execute(); // true if we got a list as a result

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
				return result;
			}
		}

	}

	public void guardar(Product producto) throws SQLException {
		ProductDAO productDAO = new ProductDAO(new ConnectionFactory().GetConnection());
		productDAO.guardar(producto);
	}

}
