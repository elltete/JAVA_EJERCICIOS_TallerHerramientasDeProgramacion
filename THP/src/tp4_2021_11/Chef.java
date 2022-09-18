package tp4_2021_11;

import java.util.ArrayList;

public class Chef {

	private String nombre;
	private ArrayList<Almacen> refrigerados;
	private ArrayList<Almacen> noRefrigerados;
	private ArrayList<Producto> productosVencidos;
	private ArrayList<Producto> productosVencidos2;

	public Chef(String nombre) {
		this.nombre = nombre;
		refrigerados = new ArrayList<Almacen>();
		noRefrigerados = new ArrayList<Almacen>();
	}

	public void agregarAlmacen(Almacen almacen, boolean valor) {
		if(valor) {
			refrigerados.add(almacen);
		}else {
			noRefrigerados.add(almacen);			
		}
	}

	public ArrayList<Producto> extraerProductosVencidos(){
		productosVencidos = new ArrayList<Producto>();
		productosVencidos2 = new ArrayList<Producto>();

		productosVencidos = noRefrigerados.get(0).productoVencido();
		productosVencidos2 = refrigerados.get(0).productoVencido();

		for(Producto p: productosVencidos2) {
			productosVencidos.add(p);
		}	
		return productosVencidos;
	}

	public TipoEstado chequearProducto(String nombre, boolean esRefrigerado) {
		TipoEstado salida = TipoEstado.NO_ENCONTRADO;
		if(!refrigerados.isEmpty() && !noRefrigerados.isEmpty()) {
			if(esRefrigerado) {
				salida = refrigerados.get(0).estadoProducto(nombre);
			}else{
				salida = noRefrigerados.get(0).estadoProducto(nombre);	
			}
		}	
		return salida;
	}

}
