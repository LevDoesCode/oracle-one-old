package com.alura.jdbc.model;

public class Product {
	public Product(String nombre, String descripcion, Integer cantidad) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
	}

	private Integer id;
	private String nombre;
	private String descripcion;
	private Integer cantidad;

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return String.format("{id: %d, Nombre: %s, Description: %s, Cantidad: %d}", this.id, this.nombre,
				this.descripcion, this.cantidad);
	}
}
