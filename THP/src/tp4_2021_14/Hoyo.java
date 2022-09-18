package tp4_2021_14;

import java.util.ArrayList;

public class Hoyo {
	
	private int numero;
	private int golpesPar;
	private ArrayList<Golfista> arrayGolfistas;
	
	public Hoyo(int numero, int golpesPar) {
		this.numero = numero;
		this.golpesPar = golpesPar;
		arrayGolfistas = new ArrayList<Golfista>();
	}

	public int getNumero() {
		return numero;
	}

	public int getGolpesPar() {
		return golpesPar;
	}
	
	public void agregarGolfista(Golfista golfista){
		arrayGolfistas.add(golfista);
	}
	
	public boolean listaGolfistaVacia() {
		boolean salida = false;
		if(arrayGolfistas.isEmpty()) {
			salida = true;
		}
		return salida;
	}

}
