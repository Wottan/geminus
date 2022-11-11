package com.geminus.entities;

public class Jaula {

	private int id;

	private String descripcion;

	public Jaula(int id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Jaula [id=" + id + ", descripcion=" + descripcion + "]";
	}

}
