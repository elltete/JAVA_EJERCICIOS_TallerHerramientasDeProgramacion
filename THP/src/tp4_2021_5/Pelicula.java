package tp4_2021_5;

import java.util.Calendar;

public class Pelicula {
	
	private String nombre;
	private int anio;
	
	public Pelicula(String nombre, int anio) {
		this.nombre = nombre;
		this.anio = anio;
	}
	
	public int getAnio() {
		return this.anio;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Servicio queContenidoEs() {
		Servicio salida = Servicio.STANDARD;
        Calendar fecha = Calendar.getInstance();
        int year = fecha.get(Calendar.YEAR);
		if(this.anio ==  year) {
			salida = Servicio.PREMIUM;
		}
		return salida;
	}

	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", anio=" + anio + "]";
	}	


}
