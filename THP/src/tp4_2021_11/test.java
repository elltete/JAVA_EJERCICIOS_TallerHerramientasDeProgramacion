package tp4_2021_11;

public class test {

	public static void main(String[] args) {

		Chef diego = new Chef("Diego");
		Almacen ref = new Almacen("Refrigerado",6);
		Almacen noRef = new Almacen("No Refrigerado",20);		

		diego.agregarAlmacen(noRef, false);
		diego.agregarAlmacen(ref, true);
		
		noRef.agregarProducto("harina", "hoy", 60);
		noRef.agregarProducto("hongos", "hoy", 10);
		noRef.agregarProducto("tomate", "hoy", 5);
		noRef.agregarProducto("pan", "hoy", 1);
		noRef.agregarProducto("agua", "hoy", 30);
		
		ref.agregarProducto("manteca", "hoy", 30);
		ref.agregarProducto("huevo", "hoy", 10);
		ref.agregarProducto("crema", "hoy", 6);
		ref.agregarProducto("leche", "hoy", 6);
		ref.agregarProducto("carne", "hoy", 3);
		
		System.out.println(diego.chequearProducto("carne", false));
		System.out.println(diego.chequearProducto("carne", true));
		System.out.println(diego.chequearProducto("harina", false));
		
		
		System.out.println(diego.extraerProductosVencidos());
	}

}
