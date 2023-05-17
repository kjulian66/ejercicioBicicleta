package test;

import domain.Ciudad;
import domain.Comuna;
import domain.Estacion;
import domain.Bicicleta;

public class TestEjercicioBicicleta {

	public static void main(String[] args) {
		
		Ciudad bsas = new Ciudad("Buenos Aires");
		
		Comuna com1 = new Comuna(100);
		Comuna com2 = new Comuna(101);
		Comuna com3 = new Comuna(102);
		bsas.addComunas(com1);
		bsas.addComunas(com2);
		bsas.addComunas(com3);
		
		Estacion est1 = new Estacion(10);
		Estacion est2 = new Estacion(11);
		Estacion est3 = new Estacion(12);
		Estacion est4 = new Estacion(13);
		Estacion est5 = new Estacion(14);
		Estacion est6 = new Estacion(15);
		com1.addEstaciones(est1);
		com1.addEstaciones(est2);
		com1.addEstaciones(est3);
		com2.addEstaciones(est4);
		com3.addEstaciones(est5);
		com3.addEstaciones(est6);
		
		Bicicleta bici1 = new Bicicleta(1);
		Bicicleta bici2 = new Bicicleta(2);
		Bicicleta bici3 = new Bicicleta(3);
		bici3.setEstado("en reparacion");
		Bicicleta bici4 = new Bicicleta(4);
		bici4.setEstado("En Uso");
		Bicicleta bici5 = new Bicicleta(5);
		Bicicleta bici6 = new Bicicleta(6);
		Bicicleta bici7 = new Bicicleta(7);
		Bicicleta bici8 = new Bicicleta(8);
		Bicicleta bici9 = new Bicicleta(9);
		Bicicleta bici10 = new Bicicleta(10);
		Bicicleta bici11 = new Bicicleta(11);
		Bicicleta bici12 = new Bicicleta(12);
		est1.addBicicleta(bici1);
		est1.addBicicleta(bici2);
		est2.addBicicleta(bici3);
		est2.addBicicleta(bici4);
		est2.addBicicleta(bici5);
		est2.addBicicleta(bici6);
		est2.addBicicleta(bici7);
		est3.addBicicleta(bici8);
		est3.addBicicleta(bici9);
		est4.addBicicleta(bici10);
		est5.addBicicleta(bici11);
		est6.addBicicleta(bici12);
		
		com1.mostrarEstadoDeEstacion(11, "disponible");
		com1.mostrarEstadoDeEstacion(11, "en reparacion");
		com1.mostrarEstadoDeEstacion(11, "en uso");
		
		com1.estacionConMayorDisponibilidad();
		com2.estacionConMayorDisponibilidad();
		com3.estacionConMayorDisponibilidad();
		
		
	}

}
