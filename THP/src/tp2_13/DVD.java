package tp2_13;

public class DVD {
	
	static final int DEFAULT_CAPACIDAD=100;
	
	private String marca;
	private boolean grabacion = false;
	private int capacidad = DEFAULT_CAPACIDAD;
	
	public DVD(String marca, boolean valor) {
		this.marca = marca;
		this.grabacion = valor;
	}	
	
	public boolean getGrabacion() {
		return this.grabacion;
	}
	
	public String getMarca() {
		return this.marca;
	}

	public int getCapacidad() {
		return this.capacidad;
	}
	
	@Override
	public String toString() {
		return "[marca=" + marca + ", grabacion=" + grabacion + ", capacidad=" + capacidad + "]";
	}

		
}