package tp4_2021_2;

public class Persona {
	
	private String nombre = null;
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void listado() {
		System.out.println("Empleado: " + this.nombre);
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}

}
