package ParcialVacacionesInvierno;

public class Propiedad {
	
	private String direccion;
	private int ambiente;
	private Zona zona;
	private double precio;
	private boolean alquilada = false;
	
	public Propiedad(String direccion, int ambiente, Zona zona, double precio) {
		this.direccion = direccion;
		this.ambiente = ambiente;
		this.zona = zona;
		this.precio = precio;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getAmbiente() {
		return ambiente;
	}

	public Zona getZona() {
		return zona;
	}

	public double getPrecio() {
		return precio;
	}

	public boolean estaAlquilada() {
		return alquilada;
	}
	
	public void pasarAlquilada() {
		this.alquilada = true;
	}

	@Override
	public String toString() {
		return "Propiedad [direccion=" + direccion + ", ambiente=" + ambiente + ", zona=" + zona + ", precio=" + precio + "]";
	}

}
