package tp2_4;

public class Persona {

	// Representa a una persona con solo lo necesario para poder ubicarla por nombre completo.

	private String nombre;
	private String apellido;
	private String dni;
	private boolean carnetConducir;
	private Vehiculo vehiculo;
	
	public Persona() {					//Metodo Constructor indica los atributos de la clase
		this.nombre = "";
		this.apellido = "";
		this.dni = "";
		this.carnetConducir = false;
		this.vehiculo = null;
	}
	
	public Persona(String nom, String ape, String dni, boolean valor, Vehiculo vehiculo ) {				//Sobrecargar de constructor
		this.nombre = nom;
		this.apellido = ape;
		this.dni = dni;
		this.carnetConducir = valor;
		this.vehiculo = vehiculo;
	}
	
	public void setNombre(String valor) {			//Metodo Setter
		this.nombre = valor;
	}
	public void setApellido(String valor) {		//Metodo Setter
		this.apellido = valor;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public void setCarnetConducir(boolean valor) {
		this.carnetConducir = valor;
	}
	
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Vehiculo getVehiculo() {
		return this.vehiculo;
	}

	public boolean getCarnetConducir() {
		return this.carnetConducir;
	}
	
	public String getNombreCompleto() {		
		return this.nombre + " " + this.apellido;
	}
	
	public void encenderAuto(Vehiculo auto) {
		auto.encender();
	}
	
	public void frenarAuto(Vehiculo auto) {
		auto.frenar(0);
	}
	
	public void apagarAuto(Vehiculo auto) {
		auto.apagar();
	}
	
	public void girarAuto(Vehiculo auto, DIRECCION valor, int grados) {
		auto.girar(valor, grados);
	}
	
	public void acelerarAuto(Vehiculo auto) {
		auto.acelerar(0);
	}
	
	@Override
	public String toString(){
		return "Persona [nombre=" + this.nombre + ", apellido=" + this.apellido + ", dni=" + this.dni + ", Carnet de conducir=" + this.carnetConducir + " " + this.vehiculo + "]";
	}
	
}