package tp2_3;

public class Vehiculo {
	
	private String marca;
	private String modelo;
	private String color;
	private int velocidadMaxima;
	private int kilometraje;
	
	public Vehiculo() {
		this.marca = "";
		this.modelo = "";
		this.color = "";
		this.velocidadMaxima = 0;
		this.kilometraje = 0;		
	}

	public Vehiculo(String marca, String modelo, String color, int velocidadMaxima) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velocidadMaxima = velocidadMaxima;
		this.kilometraje = 0;
	}
	
	@Override
	public String toString(){
		return "Vehiculo [marca=" + this.marca + ", modelo=" + this.modelo + ", color=" + this.color + ", Velocidad Maxima=" + this.velocidadMaxima + ", kilometraje=" + this.kilometraje + "]";
	}
}
