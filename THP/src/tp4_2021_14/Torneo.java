package tp4_2021_14;

import java.util.ArrayList;

public class Torneo {

	private String nombre;
	private static int cantGolfista = 0;
	private ArrayList<Hoyo> arrayHoyos;
	private ArrayList<Golfista> arrayGolfistas;

	public Torneo(String nombre) {
		this.nombre = nombre;
		arrayHoyos = new ArrayList<Hoyo>();
		arrayGolfistas = new ArrayList<Golfista>();
	}

	public void agregarHoyo(int numero, int golpes) {
		if(numero<1 || numero>18) {
			System.out.println("Numero de Hoyo incorrecto");
		}else {
			if(arrayHoyos.size()>17) {
				System.out.println("Hoyos completos");				
			}else {
				if(buscarHoyo(numero) != null) {
					System.out.println("Hoyo ya creado");
				}else {
					arrayHoyos.add(new Hoyo(numero, golpes));
					//					System.out.println("Hoyo creado");
				}
			}
		}
	}

	private Hoyo buscarHoyo(int numero) {
		Hoyo hoyo = null;
		int i = 0;
		while(i<arrayHoyos.size() && hoyo == null) {
			if(arrayHoyos.get(i).getNumero() == numero) {
				hoyo = arrayHoyos.get(i);
			}else {
				i++;
			}
		}
		return hoyo;
	}
	public void listarHoyos() {
		for(Hoyo h: arrayHoyos) {
			System.out.println(h.getNumero() + ", " + h.getGolpesPar());
		}
	}

	public void listarGolfistas() {
		for(Golfista g: arrayGolfistas) {
			System.out.println("Numero: " + g.getNumeroJugador() + ", Nombre: " + g.getNombre() + ", Apellido: " + g.getApellido());
		}
	}

	public void agregarGolfista(String nombre, String apellido) {
		if(buscarGolfista(nombre, apellido) != null) {
			System.out.println("Golfista ya existe");
		}else {
			cantGolfista++;
			arrayGolfistas.add(new Golfista(cantGolfista, nombre, apellido));
			//			System.out.println("Golfista creado");
		}
	}

	private Golfista buscarGolfista(String nombre, String apellido) {
		Golfista golfista = null;
		int i = 0;
		while(i<arrayGolfistas.size() && golfista == null) {
			if(arrayGolfistas.get(i).getNombre().equals(nombre) && arrayGolfistas.get(i).getApellido().equals(apellido)) {
				golfista = arrayGolfistas.get(i);
			}else {
				i++;
			}
		}
		return golfista;
	}

	public void jugarGolfista(String nombre, String apellido, int hoyo, int golpes) {
		Golfista golfista = buscarGolfista(nombre, apellido);
		if(golfista == null) {
			System.out.println("Golfista no existe");
		}else {
			if(buscarHoyo(hoyo) == null) {
				System.out.println("Hoyo no existe");				
			}else {
				if(golpes<1) {
					System.out.println("Ingresar golpes mayor a 0");						
				}else {
					if(golfista.hoyoJugado(hoyo)) {
						System.out.println("Hoyo ya jugado");	
					}else {
						golfista.agregarJugada(hoyo, golpes);
						buscarHoyo(hoyo).agregarGolfista(golfista);
						//						System.out.println("Juego cargado");	
					}
				}
			}
		}
	}

	public void mejorPuntaje(){
		ArrayList<Golfista> listaGolfistas = new ArrayList<Golfista>();
		int puntajeMejor = 100;
		Golfista mejorGolfista;
		for(Golfista g: arrayGolfistas) {
			if(g.puntaje(arrayHoyos) < puntajeMejor) {
				puntajeMejor = g.puntaje(arrayHoyos);
				mejorGolfista = g;
				listaGolfistas.add(0, mejorGolfista);
			}
		}
		for(Golfista g: arrayGolfistas) {
			if(g.puntaje(arrayHoyos) == puntajeMejor) {
				System.out.println(g);
				System.out.println(g.puntaje(arrayHoyos));				
			}
		}
	}

	public void hoyosNoVisitados(){
		for(Hoyo h: arrayHoyos) {
			if(h.listaGolfistaVacia()) {
				System.out.println(h.getNumero());
			}
		}
	}

}
