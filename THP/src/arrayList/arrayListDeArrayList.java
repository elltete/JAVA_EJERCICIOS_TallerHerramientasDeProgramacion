package arrayList;

import java.util.ArrayList;

public class arrayListDeArrayList {

	public static void main(String[] args) {

		//creamos una List que contendra una List de String
		ArrayList<ArrayList<String>> listaDeLista = new ArrayList<>();

		//creamos la primera List de String y le añadimos elementos
		ArrayList<String> listaStringUno = new ArrayList<>();
		listaStringUno.add("Cadena uno");
		listaStringUno.add("Cadena dos");
		//añadimos la List de String a la List de List
		listaDeLista.add(listaStringUno);

		//creamos la segunda List de String y le añadimos elementos
		ArrayList<String> listaStringDos = new ArrayList<>();
		listaStringDos.add("Cadena tres");
		//añadimos la List de String a la List de List
		listaDeLista.add(listaStringDos);

		//creamos la tercera List de String y le añadimos elementos
		ArrayList<String> listaStringTres = new ArrayList<>();
		listaStringTres.add("Cadena cuatro");
		listaStringTres.add("Cadena cinco");
		//añadimos la List de String a la List de List
		listaDeLista.add(listaStringTres);

		//imprimimos la lista de listas
		System.out.println(listaDeLista);

	}

}
