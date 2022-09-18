package tp2_2;

public class Persona {

	private String nombre;
	private String apellido;
	private String dni;
	private Computadora computadora;
	
	public Persona() {					
		this.nombre = "";
		this.apellido = "";
		this.dni = "";
		this.computadora = null;
	}
	
	public Persona(String nom, String ape, String num) {
		this.nombre = nom;
		this.apellido = ape;
		this.dni = num;
		this.computadora = null;
	}
	
	public void trabajar() {
		System.out.println("La persona " + this.nombre + " " + this.apellido + " esta trabajando");
	}

	public void descansar() {
		System.out.println("La persona " + this.nombre + " " + this.apellido + "se puso a descansar");	
	}
	
	public void setComputadora(Computadora compu) {
		this.computadora = compu;
	}
	
	public Computadora getComputadora() {
		return this.computadora;
	}
	
	@Override
	public String toString(){
		return "Persona [nombre=" + this.nombre + ", apellido=" + this.apellido + ", DNI= " + this.dni + ", " + this.computadora.toString() + "]";
	}
}
