package tp2_6;

public class Persona {
	
	private String dni;
	private String nombre;
	private String apellido;
	private String fechaNacimiento;
	private Domicilio domicilio;
	
	public Persona(String dni, String nombre, String apellido, String fechaNacimiento, String calle, int altura, String barrio) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.domicilio = new Domicilio(calle, altura, barrio);
	}

	public boolean mismoDomicilio(Persona p2) {
		boolean respuesta = false;
		if(this.getDomicilio().getCalle() == p2.getDomicilio().getCalle() && this.getDomicilio().getAltura() == p2.getDomicilio().getAltura() && this.getDomicilio().getBarrio() == p2.getDomicilio().getBarrio()) {
			respuesta = true;
		}
		return respuesta;
	}
	
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	
	public String getNombreApellido() {
		String respuesta = this.nombre + " " + this.apellido;
		return respuesta;
	}

	public String getDireccion() {
		String respuesta = this.getDomicilio().getDomicilio();
		return respuesta;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + ", domicilio=" + domicilio + "]";
	}
	
}
