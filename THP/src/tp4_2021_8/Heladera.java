package tp4_2021_8;

import java.util.ArrayList;

public class Heladera {
	
	private String marca;
	ArrayList<Producto> arrayProductos;
	
	public Heladera(String marca) {
		this.marca = marca;
		arrayProductos = new ArrayList<Producto>();
	}
	
	public void agregarProducto(Producto prod) {
		arrayProductos.add(prod);
	}

	public int productoDisponible(String nombre){
		int cant = 0;
		Producto prod = buscarProducto(nombre);
		if (prod != null){
			cant = prod.getCantidad();
		}
		return cant;
	}
	
	private Producto buscarProducto(String nombre) {
		Producto prod = null;
		int i = 0;
		while(i<arrayProductos.size() && prod == null) {
			if(arrayProductos.get(i).getNombre().equals(nombre)) {
				prod = arrayProductos.get(i);
			}else {
				i++;
			}
		}
		return prod;
	}
}
