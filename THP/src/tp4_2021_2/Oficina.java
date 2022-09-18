package tp4_2021_2;

import java.util.ArrayList;

public class Oficina {
	
	private String nombre = null;
	private ArrayList<Persona> arrayPersonas;
	
	public Oficina(String nombre) {
		this.nombre = nombre;
		arrayPersonas = new ArrayList<Persona>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void agregarPersona(Persona a) {
		arrayPersonas.add(a);
	}
	
	public void listado() {
		System.out.println("Oficina: " + this.nombre);
		for(Persona pe: arrayPersonas) {
			pe.listado();
		}
	}

}
