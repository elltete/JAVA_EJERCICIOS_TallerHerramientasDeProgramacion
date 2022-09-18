package tp4_2020_2;

public class test {

	public static void main(String[] args) {

		CD cd1 = new CD();
		CD cd2 = new CD();
		
		Cancion c1 = new Cancion("Selva");
		Cancion c2 = new Cancion("Genesis");
		Cancion c3 = new Cancion("La Balsa");
		Cancion c4 = new Cancion("Eres");
		Cancion c5 = new Cancion("Aire");
		Cancion c6 = new Cancion("Ruta 66");
		
		System.out.println("*** CD1 ***");
		cd1.agrega(c1);
		cd1.agrega(c2);
		cd1.agrega(c3);
		System.out.println(cd1.toString());
		System.out.println(cd1.dameCancion(1));
		System.out.println("Cantidad de canciones del CD1: " + cd1.numeroCanciones());
		cd1.grabaCancion(0, c4);
		cd1.agrega(c6);
		System.out.println(cd1.toString());
		cd1.elimina(0);
		System.out.println(cd1.toString());

		System.out.println("");
		System.out.println("*** CD2 ***");
		cd2.agrega(c4);
		cd2.agrega(c5);
		cd2.agrega(c6);
		System.out.println(cd2.toString());
		System.out.println(cd1.dameCancion(2));
		System.out.println("Cantidad de canciones del CD2: " + cd2.numeroCanciones());
		cd2.grabaCancion(0, c1);
		cd2.agrega(c3);
		System.out.println(cd2.toString());
		cd2.elimina(0);
		System.out.println(cd2.toString());
		
	}

}
