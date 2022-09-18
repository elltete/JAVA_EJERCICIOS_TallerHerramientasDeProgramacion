package tp4_2021_1;

public class Persona {
	
	private String dni;
	private String nombre;
	private String apellido;
	private String domicilio;
	
	public Persona(String dni, String nombre, String apellido, String domicilio) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
	}
	
	public String getDni(){
		return this.dni;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio	+ "]";
	}

}
