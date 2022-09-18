package Examen;

public class test {

	public static void main(String[] args) {

		Club SportivoVecinal = new Club("SportivoVecinal");

		SportivoVecinal.agregarSocio("Juan", 23);
		SportivoVecinal.agregarSocio("Laura", 18);
		SportivoVecinal.agregarSocio("Maria", 26);
		SportivoVecinal.agregarSocio("Joaquin", 20);
		SportivoVecinal.agregarSocio("Belen", 20);
		SportivoVecinal.agregarSocio("Daniel", 21);
		SportivoVecinal.agregarSocio("Valeria", 20);
		SportivoVecinal.agregarSocio("Ana", 19);
		SportivoVecinal.agregarSocio("Javier", 22);
		SportivoVecinal.agregarSocio("Javier", 22);
		
		System.out.print("\n");
		SportivoVecinal.establecerAmistad("Juan", "Ana");
		SportivoVecinal.establecerAmistad("Laura", "Ana");
		SportivoVecinal.establecerAmistad("Laura", "Juan");
		SportivoVecinal.establecerAmistad("Maria", "Ana");
		SportivoVecinal.establecerAmistad("Belen", "Joaquin");
		SportivoVecinal.establecerAmistad("Belen", "Daniel");
		SportivoVecinal.establecerAmistad("Valeria", "Ana");
		SportivoVecinal.establecerAmistad("Ana", "Daniel");
		SportivoVecinal.establecerAmistad("Javier", "Juan");
		SportivoVecinal.establecerAmistad("Javier", "Ana");
		SportivoVecinal.establecerAmistad("Ana", "Javier");
		SportivoVecinal.establecerAmistad("Ana", "Ana");
		SportivoVecinal.establecerAmistad("Laura", "Marcelo");
		SportivoVecinal.establecerAmistad("Toribio" , "Ana");
		
		System.out.print("\n");
		SportivoVecinal.deshacerAmistad("Ana", "Javier");
		SportivoVecinal.deshacerAmistad("Ana", "Valeria");
		SportivoVecinal.deshacerAmistad("Ana", "Ana");
		SportivoVecinal.deshacerAmistad("Laura", "Marcelo");
		SportivoVecinal.deshacerAmistad("Toribio", "Ana");
		
		System.out.print("\n");
		SportivoVecinal.listarAmigos("Laura");
		System.out.print("\n");
		SportivoVecinal.listarAmigos("Walter");		
		System.out.print("\n");		
		SportivoVecinal.listadoDeSociosyAmigos();
		
	}

}
