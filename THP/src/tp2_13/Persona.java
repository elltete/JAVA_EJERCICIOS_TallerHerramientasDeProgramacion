package tp2_13;

public class Persona {

	private String nombre;
	private String apellido;
	private String dni;
	private Computadora computadora = null;
	
	public Persona() {					
		this.nombre = "NN";
		this.apellido = "NN";
		this.dni = "0";
	}
	
	public Persona(String nom, String ape, String num) {
		this.nombre = nom;
		this.apellido = ape;
		this.dni = num;
	}
	
	public Status_DVD grabar(DVD dvd){
		Status_DVD respuesta = Status_DVD.UNIDAD_SIN_GRABADO;

		if(this.computadora.getDVD() == null) {
			respuesta = Status_DVD.SIN_DVD;
		} else if(this.computadora.getDVD().getGrabacion()) {
			respuesta = Status_DVD.GRABACION_OK;			
		}
		return respuesta;
	}
	
	public String mostrarComputadora() {
		return this.computadora.toString();
	}
	
	public void trabajar() {
		System.out.println("La persona " + this.nombre + " " + this.apellido + " se le dio la orden de trabajar");
	}

	public void descansar() {
		System.out.println("La persona " + this.nombre + " " + this.apellido + " se le dio la orden de descansar");	
	}
	
	public void setComputadora(Computadora compu) {
		this.computadora = compu;
	}
	
	public Computadora getComputadora() {
		return this.computadora;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", computadora=" + computadora
				+ ", getComputadora()=" + getComputadora() + "]";
	}

}
