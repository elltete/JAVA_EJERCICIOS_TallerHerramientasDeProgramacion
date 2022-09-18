package tp4_2021_7;

public class Paciente {

	private String dni;
	private String nombre;
	private String apellido;
	private String telefono;
	
	public Paciente(String dni, String nombre, String apellido, String telefono) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public String listado() {
		return "Paciente [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + "]";
	}
	
	
	
}
