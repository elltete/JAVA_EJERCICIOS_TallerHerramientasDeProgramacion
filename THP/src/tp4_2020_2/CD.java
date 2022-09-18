package tp4_2020_2;

import java.util.ArrayList;

public class CD {
	
	private ArrayList<Cancion> canciones;
	private int contador=0;
	
	public CD() {
		this.canciones = new ArrayList<Cancion>();
	}
	
	public int numeroCanciones() {
		return canciones.size();
	}

	public String dameCancion(int valor) {
		return canciones.get(valor).getTema();
	}
	
	public void grabaCancion(int valor, Cancion cancion) {
		canciones.set(valor, cancion);
	}
	
	public void agrega(Cancion cancion) {
		canciones.add(cancion);
		contador++;
	}
	
	public void elimina(int valor) {
		canciones.remove(valor);
		contador--;
	}

	@Override
	public String toString() {
		return "CD [canciones=" + canciones.toString() + ", contador=" + contador + "]";
	}
}
