package tp4_2021_8;

public class test {

	public static void main(String[] args) {
		
		Recetario rec = new Recetario();

		Heladera h = new Heladera("Sian");
		Alacena a = new Alacena("Easy");
		
		Receta r1 = new Receta("1", "1");
		Receta r2 = new Receta("2", "2");
		Receta r3 = new Receta("3", "3");
		
		rec.agregarReceta(r1);
		rec.agregarReceta(r2);
		rec.agregarReceta(r3);

		Ingrediente i1 = new Ingrediente("Milanesa", 2, true);
		Ingrediente i2 = new Ingrediente("Pure", 1, false);
		
		Ingrediente i3 = new Ingrediente("Fideo", 1, false);
		Ingrediente i4 = new Ingrediente("Tomate", 2, true);
		
		Ingrediente i5 = new Ingrediente("Papa", 2, false);
		Ingrediente i6 = new Ingrediente("leche", 4, true);
		
		r1.agregarIngrediente(i1);
		r1.agregarIngrediente(i2);
		r2.agregarIngrediente(i3);
		r2.agregarIngrediente(i4);
		r3.agregarIngrediente(i5);
		r3.agregarIngrediente(i6);
		
		Producto p1 = new Producto("Milanesa", 1, "NA");
		Producto p2 = new Producto("Pure", 1, "NA");
		
		Producto p3 = new Producto("Fideo", 3, "NA");
		Producto p4 = new Producto("Tomate", 2, "NA");
		
		Producto p5 = new Producto("Papa", 4, "NA");
		Producto p6 = new Producto("leche", 2, "NA");
		
		h.agregarProducto(p1);
		h.agregarProducto(p4);
		h.agregarProducto(p6);
		a.agregarProducto(p2);
		a.agregarProducto(p3);
		a.agregarProducto(p5);
		
		System.out.println("Funcion prepararListadoAComprar");
		rec.listado(rec.prepararListadoAComprar("1", 4, h, a));
		
		System.out.println("Funcion recetasPosiblesAPreparar");
		rec.listado2(rec.recetasPosiblesAPreparar(h, a, 2));
	}

}
