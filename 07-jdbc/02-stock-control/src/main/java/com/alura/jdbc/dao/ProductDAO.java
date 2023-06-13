package com.alura.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.alura.jdbc.model.Product;

public class ProductDAO {

	final private Connection conn;

	public ProductDAO(Connection conn) {
		this.conn = conn;
	}

	public void guardar(Product producto) throws SQLException {
		try (conn) {
			conn.setAutoCommit(false);

			final PreparedStatement statement = conn.prepareStatement(
					"INSERT INTO products " + "(name, description, quantity) " + "VALUES(?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);

			try (statement) {
				ejecutaRegistro(producto, statement);
				conn.commit();
			} catch (Exception e) {
				conn.rollback();
			}
		}
	}

	private void ejecutaRegistro(Product producto, PreparedStatement statement) throws SQLException {
		statement.setString(1, producto.getNombre());
		statement.setString(2, producto.getDescripcion());
		statement.setInt(3, producto.getCantidad());

		statement.execute();

		// try with resources, java 7+
		try (ResultSet result = statement.getGeneratedKeys();) {
			while (result.next()) {
				System.out.println(String.format("Inserted with ID %d", result.getInt(1)));
				// producto.setId(result.getInt(1));
				// no need to close result explicitly
			}
		}

		// try with resources, java 9+
		final ResultSet result = statement.getGeneratedKeys();
		try (result) {
			while (result.next()) {
				producto.setId(result.getInt(1));
				System.out.println(String.format("New product added: %s", producto));
			}
		}
	}
}
