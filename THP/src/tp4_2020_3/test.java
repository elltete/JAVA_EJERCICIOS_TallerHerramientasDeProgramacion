package tp4_2020_3;

import java.util.Scanner;

public class test {
	
	private static Scanner input = new Scanner(System.in);
	final static String SALIR = "F";

	public static void main(String[] args) {

		//ALTA DE SUPERMERCADO
		
		Supermercado supermercado1 = new Supermercado("Coto");
		
		//ALTA DE PRODUCTOS
		
		supermercado1.getArrayProductos().add(new Producto("MANZANA", 10));
		supermercado1.getArrayProductos().add(new Producto("OREO", 20));
		supermercado1.getArrayProductos().add(new Producto("PEPITOS", 15));
		supermercado1.getArrayProductos().add(new Producto("CEPITA", 20));
		supermercado1.getArrayProductos().add(new Producto("AGUA", 25));
		supermercado1.getArrayProductos().add(new Producto("PAN", 30));
		
		//INGRESO DE COMPRA
		Compra compra1 = new Compra();
		supermercado1.getArrayCompras().add(compra1);

		String producto = ingreseProdcuto();
		
		while (!producto.equals(SALIR) ){
			int cantidad = ingreseCantidad();
			compra1.getArrayTickets().add(new Ticket(producto, cantidad));
			producto = ingreseProdcuto();
		}
		
		//MOSTRAR EL TICKET CON EL DETALLE DE LA COMPRA
		mostrarTicket(compra1, supermercado1);
		
		input.close();
	}

	public static String ingreseProdcuto() {
		System.out.println("Ingrese nombre del producto (F=Salir):");
		String producto =  input.nextLine().toUpperCase();
		return producto;
	}

	public static int ingreseCantidad() {
		System.out.println("Ingrese cantidad:");
		int cantidad =  Integer.parseInt(input.nextLine());
		return cantidad;
	}
	
	public static void mostrarTicket(Compra compra, Supermercado sup) {
		System.out.println("*** DETALLE DE LA COMPRA ***");
		compra.mostrarCompra(sup);
	}
	
}
