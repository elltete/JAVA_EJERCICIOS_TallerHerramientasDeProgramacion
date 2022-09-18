package tp4_2021_8;

public class Ingrediente {
	
	private String nombre;
	private int cantidad;
	private boolean esRefrigerado = false;
	
	public Ingrediente(String nombre, int cantidad, boolean esRefrigerado) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.esRefrigerado = esRefrigerado;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public boolean isEsRefrigerado() {
		return esRefrigerado;
	}

	@Override
	public String toString() {
		return "Ingrediente [nombre=" + nombre + ", cantidad=" + cantidad + ", esRefrigerado=" + esRefrigerado + "]";
	}
	
}
