package tp4_2021_11;

import java.util.ArrayList;

public class Almacen {
	
	private String nombre;
	private int temperatura;
	private ArrayList<Producto> arrayProductos;
	private ArrayList<Producto> listado;
	
	public Almacen(String nombre, int temperatura) {
		this.nombre = nombre;
		this.temperatura = temperatura;
		arrayProductos = new ArrayList<Producto>();
	}
	
	public void agregarProducto(String nombre, String fechaAlmacenamiento, int diasMaximo) {
		arrayProductos.add(new Producto(nombre, fechaAlmacenamiento, diasMaximo));		
	}

	public TipoEstado estadoProducto(String nombre){
		TipoEstado tipo = TipoEstado.NO_ENCONTRADO;
		Producto producto = buscarProducto(nombre);
		if(producto != null) {
			tipo = producto.estadoProducto();
		}
		return tipo;
	}
	
	public ArrayList<Producto> productoVencido() {
		listado = new ArrayList<Producto>(); 
		for(Producto p: arrayProductos) {
			if(p.estadoProducto() == TipoEstado.PARA_DESCARTE) {
				listado.add(p);
			}
		}
		return listado;
		
	}
	
	private Producto buscarProducto(String nombre) {
		Producto producto = null;
		int i = 0;
		while(i<arrayProductos.size() && producto == null) {
			if(arrayProductos.get(i).getNombre().equals(nombre)) {
				producto = arrayProductos.get(i);
			}else {
				i++;
			}
		}
		return producto;
	}
	
}