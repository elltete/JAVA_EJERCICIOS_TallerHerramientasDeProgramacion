package tp4_2021_3;

public class test {

	public static void main(String[] args) {

		Inmobiliaria remax = new Inmobiliaria("Remax");
		
		Barrio palermo = new Barrio("Palermo");
		
		Barrio boca = new Barrio("Boca");
		remax.agregarBarrio(boca);
		Barrio retiro = new Barrio("Retiro");
		remax.agregarBarrio(retiro);
		Barrio flores = new Barrio("Flores");
		remax.agregarBarrio(flores);
		Barrio caballito = new Barrio("Caballito");
		remax.agregarBarrio(caballito);

		boca.agregarPropiedad(new Propiedad("Boca", 1000000, Tipo.CASA));
		boca.agregarPropiedad(new Propiedad("Boca", 500000, Tipo.DEPARTAMENTO));
		retiro.agregarPropiedad(new Propiedad("Retiro", 400000, Tipo.PH));
		retiro.agregarPropiedad(new Propiedad("Retiro", 500000, Tipo.CASA));
		flores.agregarPropiedad(new Propiedad("Flores", 800000, Tipo.DEPARTAMENTO));
		flores.agregarPropiedad(new Propiedad("Flores", 220000, Tipo.PH));
		caballito.agregarPropiedad(new Propiedad("Caballito", 550000, Tipo.CASA));
		caballito.agregarPropiedad(new Propiedad("Caballito", 330000, Tipo.DEPARTAMENTO));
	
		boca.mostrarPropiedades(Tipo.CASA);
		retiro.mostrarPropiedades();
		flores.mostrarPropiedades(Tipo.DEPARTAMENTO);
		caballito.mostrarPropiedades();
		
		remax.obtenerBarrioMaxProp();
		remax.borrarPropiedad("Retiro");
		boca.mostrarPropiedades();
		retiro.mostrarPropiedades();
		

		remax.cambiarPropiedadDeBarrio("Boca", "Caballito");
		
		System.out.println("BOCA");
		boca.mostrarPropiedades();
		System.out.println("CABALLITO");
		caballito.mostrarPropiedades();
	}

}
