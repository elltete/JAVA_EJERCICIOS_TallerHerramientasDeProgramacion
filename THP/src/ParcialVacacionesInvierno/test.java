package ParcialVacacionesInvierno;

public class test {

	public static void main(String[] args) {

		Inmobiliaria remax = new Inmobiliaria("Remax");
		
		remax.ingresarPropiedad("a", 2, Zona.NORTE, 2000);
		remax.ingresarPropiedad("b", 3, Zona.NORTE, 2000);		
		remax.ingresarPropiedad("c", 2, Zona.NORTE, 3000);
		
		remax.alquilarPropiedad("a");
		remax.alquilarPropiedad("a");
		remax.alquilarPropiedad("b");
		
		remax.mostrarPropiedadesOcupadas();
		
		remax.mostrarPorcentajeOcupacion(Zona.NORTE);
		remax.mostrarPorcentajeOcupacion(Zona.LAGO);

	}

}
