package tp4_2021_14;

public class test {

	public static void main(String[] args) {

		Torneo golf = new Torneo("Golf 2021");
		
		for(int i=1; i<7; i++) {
			golf.agregarHoyo(i, 4);
			golf.agregarHoyo(i+6, 5);
			golf.agregarHoyo(i+12, 6);
		}
		
		golf.agregarGolfista("D", "P");
		golf.agregarGolfista("A", "G");
		golf.agregarGolfista("T", "V");
		golf.agregarGolfista("G", "G");

		for(int i=1; i<7; i++) {
			golf.jugarGolfista("D", "P", i, 3);
			golf.jugarGolfista("D", "P", i+6, 5);
			golf.jugarGolfista("A", "G", i, 3);
			golf.jugarGolfista("A", "G", i+6, 5);
			golf.jugarGolfista("T", "V", i, 3);
			golf.jugarGolfista("T", "V", i+6, 6);
			golf.jugarGolfista("G", "G", i, 4);
			golf.jugarGolfista("G", "G", i+6, 5);
		}

		golf.mejorPuntaje();
		
		golf.hoyosNoVisitados();
		
	}

}
