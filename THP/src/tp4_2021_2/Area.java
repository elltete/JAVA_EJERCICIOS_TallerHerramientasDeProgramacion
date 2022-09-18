package tp4_2021_2;

import java.util.ArrayList;

public class Area {

	private String nombre = null;
	private ArrayList<Oficina> arrayOficinas;
	
	public Area(String nombre) {
		this.nombre = nombre;
		arrayOficinas = new ArrayList<Oficina>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void agregarOficina(Oficina a) {
		arrayOficinas.add(a);
	}
	
	public void listado() {
		System.out.println("Area: " + this.nombre);
		for(Oficina of: arrayOficinas) {
			of.listado();
		}
		System.out.println("\n");
	}
		
}
