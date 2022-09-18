package Examen;

public class Amigo {
	
	private String nombre;
	private int edad;
	
	public Amigo(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Amigo [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
