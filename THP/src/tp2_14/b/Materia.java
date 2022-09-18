package tp2_14.b;

import java.util.ArrayList;

public class Materia {

	private String nombreMateria;
	private ArrayList<Notas> notasArray = new ArrayList<Notas>();

	public Materia(String materia) {
		nombreMateria = materia;
	}
	
	public void ingresar(double nota) {
		notasArray.add(new Notas(nota));
		
	}

	public double obtenerPromedio() {
		double respuesta;
		if(notasArray.size() == 0) {
			respuesta = 0;
		}else {
			respuesta = totalNotas() / notasArray.size();
		}
		return respuesta;
	}

	private double totalNotas() {
		double respuesta = 0;
		for(Notas n: notasArray) {
			if(n != null)
				respuesta += n.getNota();
		}
		return respuesta;
	}

	public ArrayList<Notas> getNotas() {
		return this.notasArray;
	}

}
