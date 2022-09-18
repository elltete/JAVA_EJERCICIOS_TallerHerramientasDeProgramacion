package tp4_2021_6;

import java.util.Date;

public class test {

	public static void main(String[] args) {

		Aplicacion MusicApp = new Aplicacion("MusicApp");

		MusicApp.altaCancion("Back in Black", "ACDC", GeneroMusical.ROCK);
		MusicApp.altaCancion("TNT", "ACDC", GeneroMusical.ROCK);
		MusicApp.altaCancion("One", "Metallica", GeneroMusical.ROCK);
		MusicApp.altaCancion("Enter Sandman", "Metallic", GeneroMusical.ROCK);
		MusicApp.altaCancion("Beautiful Day", "U2", GeneroMusical.POP);
		MusicApp.altaCancion("One", "U2", GeneroMusical.POP);
		MusicApp.altaCancion("My Way", "Frank Sinatra", GeneroMusical.CLASICO);
		MusicApp.altaCancion("Ocho Cuarenta", "Rodrigo", GeneroMusical.CUMBIA);

		MusicApp.altaUsuario("diego@com", "Diego", 46);
		MusicApp.altaUsuario("ariel@com", "Ariel", 42);		
		MusicApp.altaUsuario("gaby@com", "Gaby", 38);
		MusicApp.altaUsuario("lauti@com", "Lauti", 6);

		MusicApp.listarCancionesPorUsuario("diego@com");

		MusicApp.cambiarCategoria("diego@com", CategoriaUsuario.PREMIUM);
		MusicApp.listarUsuarios();

		System.out.println(MusicApp.escucharCancion("diego@com", "TNT", "ACDC"));
		System.out.println(MusicApp.escucharCancion("diego@com", "TNT", "ACDC"));
		System.out.println(MusicApp.escucharCancion("diego@com", "TNT", "AC-DC"));		
		System.out.println(MusicApp.escucharCancion("diego@.com", "TNT", "ACDC"));
		System.out.println(MusicApp.escucharCancion("ariel@com", "TNT", "ACDC"));		
		System.out.println(MusicApp.escucharCancion("ariel@com", "TNT", "ACDC"));
		System.out.println(MusicApp.escucharCancion("ariel@com", "TNT", "ACDC"));
		
		
		MusicApp.listarCancionesPorUsuario("ariel@com");

	}

}
