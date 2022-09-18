package tp4_2021_14;

import java.util.ArrayList;

public class Golfista {

	private int numeroJugador;
	private String nombre;
	private String apellido;
	private ArrayList<HoyoJugado> arrayHoyosJugados;
	
	public Golfista(int numeroJugador, String nombre, String apellido) {
		this.numeroJugador = numeroJugador;
		this.nombre = nombre;
		this.apellido = apellido;
		arrayHoyosJugados = new ArrayList<HoyoJugado>();
	}

	public int getNumeroJugador() {
		return numeroJugador;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	public boolean hoyoJugado(int hoyo) {
		boolean salida = false;
		int i = 0;
		while(i<arrayHoyosJugados.size() && !salida) {
			if(arrayHoyosJugados.get(i).getNumero() == hoyo) {
				salida = true;
			}else {
				i++;
			}
		}
		return salida;
	}
	
	public void agregarJugada(int hoyo, int golpes) {
		arrayHoyosJugados.add(new HoyoJugado(hoyo, golpes));
	}
	
	public int puntaje(ArrayList<Hoyo> listaHoyos) {
		int puntos = 0;
		for(HoyoJugado hj: arrayHoyosJugados) {
			puntos += (hj.getCantGolpes()-golpesParHoyo(listaHoyos, hj.getNumero()));
		}
		return puntos;
	}
	
	private int golpesParHoyo(ArrayList<Hoyo> listaHoyos, int numero) {
		int cant = 0;
		int i = 0;
		while(i<listaHoyos.size() && cant == 0) {
			if(listaHoyos.get(i).getNumero() == numero) {
				cant = listaHoyos.get(i).getGolpesPar();
			}else {
				i++;
			}
		}
		return cant;
	}

	@Override
	public String toString() {
		return "Golfista [numeroJugador=" + numeroJugador + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", arrayHoyosJugados=" + arrayHoyosJugados + "]";
	}

}
