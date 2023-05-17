package domain;

import java.util.ArrayList;
import java.util.List;

public class Ciudad {
	
	// Atributos
	private String nombre;
	private List<Comuna> comunas;

	// Constructores
	public Ciudad(String nombre) {
		this.nombre = nombre;
		this.comunas = new ArrayList<>();
	}

	
	// Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Comuna> getComunas() {
		return comunas;
	}

	public void setComunas(List<Comuna> comunas) {
		this.comunas = comunas;
	}
	
	// Metodos
	public void addComunas(Comuna comuna) {
		this.comunas.add(comuna);
	}
	
	public Comuna buscarComunas(Comuna comuna) {
		Comuna resultado = null;
		if (this.comunas.contains(comuna)) {
			int indice = this.comunas.indexOf(comuna);
			if (indice > -1) {
				resultado = this.comunas.get(indice);
			}
		}
		return resultado;
	}
	
	public void mostrarComunas() {
		for (Comuna comuna : comunas) {
			System.out.println(comuna.toString());
		}
	}

	@Override
	public String toString() {
		return "Ciudad [nombre=" + nombre + ", comunas=" + comunas + "]";
	}
	
	
	
}
