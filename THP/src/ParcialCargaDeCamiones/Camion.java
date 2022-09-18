package ParcialCargaDeCamiones;

import java.util.ArrayList;

public class Camion {
	
	final static double PESOMAXIMO = 3000;
	
	private String patente;
	private double pesoCarga = 0;
	private ArrayList<Paquete> arrayPaquetes;
	
	public Camion(String patente) {
		this.patente = patente;
		arrayPaquetes = new ArrayList<Paquete>();
	}
	
	public boolean cargarPaquete(Paquete paquete) {
		boolean salida = false;
		if(hayLugar(paquete)) {
			arrayPaquetes.add(paquete);
			salida = true;
		}
		return salida;
	}
	
	public void ordenarCargar() {
		
	}

	public boolean hayLugar(Paquete paquete) {
		boolean salida = false;
		if(paquete.getPeso() + pesoCarga< PESOMAXIMO) {
			salida = true;
		}
		return salida;
	}

	public double getPesoCarga() {
		return pesoCarga;
	}

	public ArrayList<Paquete> getArrayPaquetes() {
		return arrayPaquetes;
	}
	
	 
	
}
