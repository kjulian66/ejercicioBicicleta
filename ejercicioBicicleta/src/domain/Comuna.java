package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Comuna {
	
	// Atributos
	private Integer numero;
	private List<Estacion> estaciones;
	
	// Constructores
	public Comuna(Integer numero) {
		this.numero = numero;
		this.estaciones = new ArrayList<>();
	}
	
	// Getters & Setters
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public List<Estacion> getEstaciones() {
		return estaciones;
	}

	public void setEstaciones(List<Estacion> estaciones) {
		this.estaciones = estaciones;
	}
	
	//Metodos 
	public void addEstaciones(Estacion estacion) {
		this.estaciones.add(estacion);
	}
	
	public Estacion buscarEstaciones(Estacion estacion) {
		Estacion resultado = null;
		if (this.estaciones.contains(estacion)) {
			int indice = this.estaciones.indexOf(estacion);
			if (indice > -1) {
				resultado = this.estaciones.get(indice);
			}
		}
		return resultado;
	}
	
	public void mostrarComunas() {
		for (Estacion estacion : estaciones) {
			System.out.println(estacion.toString());
		}
	}

	@Override
	public String toString() {
		return "Comuna [numero=" + numero + ", estaciones=" + estaciones + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comuna other = (Comuna) obj;
		return Objects.equals(numero, other.numero);
	}
	
	public void mostrarEstadoDeEstacion (Integer id, String estado) {
		Boolean estacionEncontrada = false;
		for (Estacion estacion : estaciones) {
			if (id == estacion.getId()) {
				estacionEncontrada = true;
				if (estado.equalsIgnoreCase(Bicicleta.getDisponible())) {
					System.out.println("La cantidad de bicicletas disponibles en esta estacion es de % " + (estacion.cantidadBicicletasDisponibles() * 100) / estacion.getBicicletas().size());
				}

				if (estado.equalsIgnoreCase(Bicicleta.getEnUso())) {
					System.out.println("La cantidad de bicicletas en uso en esta estacion es de % " + (estacion.cantidadBicicletasEnUso() * 100) / estacion.getBicicletas().size());
				} 
				
				if (estado.equalsIgnoreCase(Bicicleta.getEnReparacion())) {
					System.out.println("La cantidad de bicicletas en reparacion en esta estacion es de % " + (estacion.cantidadBicicletasEnReparacion() * 100) / estacion.getBicicletas().size());
				} 	
			}
		}
		
		if (!estacionEncontrada) {
			System.out.println("La estacion no existe");
		}		
	}
	
	public void estacionConMayorDisponibilidad () {
		int estacionMayor = 0;
		for (Estacion estacion : estaciones) {
			int disponibilidad = (estacion.cantidadBicicletasDisponibles() * 100) / estacion.getBicicletas().size();
			if (disponibilidad > 0) {
				estacionMayor = estacion.getId();
			}
		}
		System.out.println("La estacion con mayor disponibilidad es la: " + estacionMayor);
		
	}
	

}
