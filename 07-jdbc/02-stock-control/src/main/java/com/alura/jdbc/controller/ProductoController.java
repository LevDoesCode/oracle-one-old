package com.alura.jdbc.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alura.jdbc.factory.ConnectionFactory;

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

	public void guardar(Map<String, String> producto) throws SQLException {
		String nombre = producto.get("NAME");
		String descripcion = producto.get("DESCRIPTION");
		Integer cantidad = Integer.valueOf(producto.get("QUANTITY"));
		Integer maximoCantidad = 50;

		final Connection conn = new ConnectionFactory().GetConnection();

		try (conn) {
			conn.setAutoCommit(false); // Cancel auto commit after each statement execute

			final PreparedStatement statement = conn.prepareStatement(
					"INSERT INTO products " + "(name, description, quantity) " + "VALUES(?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);

			try (statement) {
				do {
					int cantidadParaGuardar = Math.min(cantidad, maximoCantidad);
					ejecutaRegistro(nombre, descripcion, cantidadParaGuardar, statement);
					cantidad -= cantidadParaGuardar;
				} while (cantidad > 0);
				conn.commit();
				System.out.println("commited");
			} catch (Exception e) {
				conn.rollback();
				System.out.println("Rollback");
			}
		}
	}

	private void ejecutaRegistro(String nombre, String descripcion, Integer cantidad, PreparedStatement statement)
			throws SQLException {
		if (cantidad < 50) {
			throw new RuntimeException("New error registering");
		}
		statement.setString(1, nombre);
		statement.setString(2, descripcion);
		statement.setInt(3, cantidad);

		statement.execute();

		// try with resources, java 7+
		try (ResultSet result = statement.getGeneratedKeys();) {
			while (result.next()) {
				System.out.println(String.format("Inserted with ID %d", result.getInt(1)));
				// no need to close result explicitly
			}
		}

		// try with resources, java 9+
		final ResultSet result = statement.getGeneratedKeys();
		try (result) {
			while (result.next()) {
				System.out.println(String.format("Inserted with ID %d", result.getInt(1)));
				// no need to close result explicitly
			}
		}

		// result.close(); // not needed and out of scope
	}

}
