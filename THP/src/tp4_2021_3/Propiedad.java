package tp4_2021_3;

public class Propiedad {

	private String domicilio;
	private double precio;
	private Tipo tipo;
	
	public Propiedad(String domicilio, double precio, Tipo tipo) {
		this.domicilio = domicilio;
		this.precio = precio;
		this.tipo = tipo;
	}
	
	public Tipo getTipo() {
		return tipo;
	}
	
	public String getDomicilio() {
		return domicilio;
	}

	@Override
	public String toString() {
		return "Propiedad [domicilio=" + domicilio + ", precio=" + precio + "]";
	}
	
}
