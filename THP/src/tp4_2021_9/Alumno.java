package tp4_2021_9;

import java.util.ArrayList;

public class Alumno {
	
	final static int MINIMO_APP = 4;
	
	private String nombre;
	private String email;
	ArrayList<Materia> arrayMateriasAprobadas;
	
	public Alumno(String nombre, String email) {
		this.nombre = nombre;
		this.email = email;
		arrayMateriasAprobadas = new ArrayList<Materia>();
	}
	
	public void agregarMateria(Materia materia) {
		arrayMateriasAprobadas.add(materia);
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}
	
	public boolean cumpleCondicion(double promedioMinimo){
		boolean salida = false;
		if (promedioMinimo<=calcularpromedio()) {
			salida = true;
		}
		return salida;
	}
	
	private double calcularpromedio() {
		double promedio = 0;
		double sumaNotas = 0;
		for(Materia m: arrayMateriasAprobadas) {
			sumaNotas = sumaNotas + m.getNota(); 
		}
		double cantMateriasApp = arrayMateriasAprobadas.size();
		if(cantMateriasApp!=0 && cantMateriasApp>MINIMO_APP) {
			promedio = sumaNotas/cantMateriasApp;
		}
		return promedio;
	}

}
