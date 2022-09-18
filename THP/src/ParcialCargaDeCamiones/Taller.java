package ParcialCargaDeCamiones;

import java.util.ArrayList;

public class Taller {
	
	private String domicilio;
	private String telefono;
	private ArrayList<Camion> arrayCamiones;
	
	public Taller(String domicilio, String telefono) {
		this.domicilio = domicilio;
		this.telefono = telefono;
		arrayCamiones = new ArrayList<Camion>();
	}
	
}
