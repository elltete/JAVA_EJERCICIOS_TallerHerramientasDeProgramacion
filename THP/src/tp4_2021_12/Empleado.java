package tp4_2021_12;

public class Empleado {
	
	private String nombre;
	private int legajo;
	private Oficina oficina;
	
	public Empleado(String nombre, int legajo, Oficina oficina) {
		this.nombre = nombre;
		this.legajo = legajo;
		this.oficina = oficina;
	}

	public String getNombre() {
		return nombre;
	}

	public int getLegajo() {
		return legajo;
	}

	public Oficina getOficina() {
		return oficina;
	}

}
