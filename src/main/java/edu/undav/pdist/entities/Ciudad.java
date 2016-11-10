package edu.undav.pdist.entities;

import java.io.Serializable;

public class Ciudad implements Serializable {
	
	private static final long serialVersionUID = -678600302046367769L;
	
	private String nombre;
	private String id;

	public Ciudad(String nombre, String id) {
		this.nombre = nombre;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "CityName:" + nombre + " ID:" + id;
	}

	
}
