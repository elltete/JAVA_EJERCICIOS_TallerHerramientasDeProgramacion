package tp4_2021_9;

import java.util.ArrayList;

public class Institucion {
	
	private String nombre;
	ArrayList<Carrera> arrayCarrera;
	
	public Institucion(String nombre) {
		this.nombre = nombre;
		arrayCarrera = new ArrayList<Carrera>(); 
	}
	
	public void agregarCarrera(Carrera carrera) {
		arrayCarrera.add(carrera);
	}
	

}
