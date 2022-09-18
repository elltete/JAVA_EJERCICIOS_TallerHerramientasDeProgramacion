package tp4_2020_3;

import java.util.ArrayList;

public class Compra {
	
	private ArrayList<Ticket> arrayTickets;
	
	public Compra() {
		arrayTickets = new ArrayList<Ticket>();
	}
	
	public ArrayList<Ticket> getArrayTickets(){
		return arrayTickets;
	}
	
	public void mostrarCompra(Supermercado sup) {
		double total=0, precio=0 ;
		for(Ticket t: arrayTickets) {
			precio = buscarPrecio(t.getProdcuto(), sup.getArrayProductos());	
			System.out.println("Producto: " + t.getProdcuto() + " Cantidad: " + t.getCantidad() + " Precio: " + precio);
			total+=t.getCantidad()*precio;
		}
		System.out.println("Costo total de la compra: $ " + total);
	}
	
	public double buscarPrecio(String producto, ArrayList<Producto> prod) {
		double precio=0;
		boolean seguir = true;
		int i=0;
		while (i<prod.size() && seguir) {
			if (prod.get(i).getNombre().equals(producto)) {
				precio = prod.get(i).getPrecio();
				seguir = false;
			}
			i++;
		}
		return precio;
	}

}
