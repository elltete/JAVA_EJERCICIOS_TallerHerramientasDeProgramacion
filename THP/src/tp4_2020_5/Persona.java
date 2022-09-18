package tp4_2020_5;

public class Persona {
	
	private String nombre;
	private String apellido;
	private String dni;
	private String telefono;
	private String email;
	
	public Persona(String nombre, String apellido, String dni, String telefono, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.email = email;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", telefono=" + telefono
				+ ", email=" + email + "]";
	}

}
