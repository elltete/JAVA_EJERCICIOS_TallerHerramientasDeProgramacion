package tp4_2021_5;

public class test {

	public static void main(String[] args) {

		Sitio ortflix = new Sitio("ORTFlix");
		
		ortflix.agregarPelicula(new Pelicula("Iron Man I", 2008));
		ortflix.agregarPelicula(new Pelicula("Iron Man II", 2010));
		ortflix.agregarPelicula(new Pelicula("The Avengers", 2012));
		ortflix.agregarPelicula(new Pelicula("Iron Man III", 2013));
		ortflix.agregarPelicula(new Pelicula("Thor I", 2013));
		ortflix.agregarPelicula(new Pelicula("Doctor Strange", 2016));
		ortflix.agregarPelicula(new Pelicula("Spider-Man Homecoming", 2017));
		ortflix.agregarPelicula(new Pelicula("Venom", 2018));
		ortflix.agregarPelicula(new Pelicula("Captain Marvel", 2019));
		ortflix.agregarPelicula(new Pelicula("WandaVision", 2020));
		ortflix.agregarPelicula(new Pelicula("The Avengers I", 2015));
		ortflix.agregarPelicula(new Pelicula("The Avengers II", 2021));
		
	
		ortflix.darDeAlta("10", Servicio.PREMIUM);
		ortflix.darDeAlta("20", Servicio.STANDARD);
		ortflix.darDeAlta("30", Servicio.PREMIUM);
		ortflix.darDeAlta("40", Servicio.STANDARD);
		
		System.out.println(ortflix.verPelicula("10", "The Avengers II"));
		System.out.println(ortflix.verPelicula("10", "Thor I"));
		System.out.println(ortflix.verPelicula("40", "The Avengers V"));		
		
		
		System.out.println(ortflix.darDeBaja("40"));
		System.out.println(ortflix.verPelicula("40", "The Avengers V"));
		
		
		ortflix.setearPrecioCliente("10", 10);
		System.out.println(ortflix.darDeBaja("10"));		
		ortflix.setearPrecioCliente("20", 10);
		System.out.println(ortflix.darDeBaja("20"));
		System.out.println("Lista negra 1");
		ortflix.setearPrecioCliente("30", 10);
		System.out.println(ortflix.darDeBaja("30"));
//		ortflix.setearPrecioCliente("40", 10);
		System.out.println(ortflix.darDeBaja("40"));
		ortflix.listarClientesListaNegra();
		ortflix.listarClientes();
//		ortflix.listarPeliculas();
		ortflix.depurarListaNegra(10);
		System.out.println("Lista negra 2");
		ortflix.listarClientesListaNegra();

	}

}
