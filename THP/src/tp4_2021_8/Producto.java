package tp4_2021_8;

import java.util.ArrayList;

public class Producto {

	private String nombre;
	private int cantidad;

	private String fechaVencimiento;
	
	public Producto(String nombre, int cantidad, String fechaVencimiento) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCantidad() {
		return cantidad;
	}
	
}
