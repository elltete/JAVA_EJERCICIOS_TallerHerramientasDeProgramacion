package tp4_2021_2;

import java.util.ArrayList;

public class Compania {
	
	private String nombre = null;
	private ArrayList<Area> arrayAreas;
	
	public Compania(String nombre) {
		this.nombre = nombre;
		arrayAreas = new ArrayList<Area>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void agregarArea(Area a) {
		arrayAreas.add(a);
	}
	
	public void listado() {
		System.out.println("Compania: " + this.nombre);
		for(Area ar: arrayAreas) {
			ar.listado();
		}
	}

}
