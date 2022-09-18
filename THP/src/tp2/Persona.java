package tp2;

public class Persona {

	// Representa a una persona con solo lo necesario para poder ubicarla por nombre completo.

	private String nombre;
	private String apellido;
	
	public Persona() {					//Metodo Constructor indica los atributos de la clase
		this.nombre = "";
		this.apellido = "";	
	}
	
	public Persona(String nom, String ape) {				//Sobrecargar de constructor
		this.nombre = nom;
		this.apellido = ape;
	}
	
	public Persona(String nom) {				//Sobrecargar de constructor
		this.nombre = nom;
		this.apellido = "";
	}
	
	public void setNombre(String valor) {			//Metodo Setter
		this.nombre = valor;
	}
	public void setApellido(String valor) {		//Metodo Setter
		this.apellido = valor;
	}
	public String getNombreCompleto() {			////Metodo Getter
		return this.nombre + " " + this.apellido;
	}
	
	@Override
	public String toString(){
		return "Persona [nombre=" + this.nombre + ", apellido=" + this.apellido + "]";
	}
	
}

