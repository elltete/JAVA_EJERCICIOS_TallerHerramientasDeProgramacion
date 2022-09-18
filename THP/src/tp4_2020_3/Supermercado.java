package tp4_2020_3;

import java.util.ArrayList;

public class Supermercado {
	
	private String nombreSupermercado;
	private ArrayList<Producto> arrayProductos;
	private ArrayList<Compra> arrayCompras;
	
	public Supermercado(String nombre) {
		this.nombreSupermercado = nombre;
		arrayProductos = new ArrayList<Producto>();
		arrayCompras = new ArrayList<Compra>();
	}
	
	public ArrayList<Producto> getArrayProductos(){
		return arrayProductos;
	}
	
	public ArrayList<Compra> getArrayCompras(){
		return arrayCompras;
	}	
	

}
