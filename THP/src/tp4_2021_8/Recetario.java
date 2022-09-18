package tp4_2021_8;

import java.util.ArrayList;

public class Recetario {

	ArrayList<Receta> arrayRecetas;
	ArrayList<Receta> listaRecetas;	
	ArrayList<Ingrediente> listaCompras;

	public Recetario() {
		arrayRecetas = new ArrayList<Receta>();
	}
	
	public void agregarReceta(Receta rec) {
		arrayRecetas.add(rec);
	}

	public ArrayList<Ingrediente> prepararListadoAComprar(String receta, int cantPorciones, Heladera heladera, Alacena alacena){
		listaCompras = new ArrayList<Ingrediente>();
		Receta rec = buscarReceta(receta);
		if(rec == null) {
			System.out.println("La receta no existe");
		}else {
			listaCompras = rec.devolverIngredientes(cantPorciones, heladera, alacena);
		}
		return listaCompras;
	}
	
	public void listado(ArrayList<Ingrediente> lst) {
		for(Ingrediente i: lst) {
			System.out.println(i.toString());
		}
	}

	private Receta buscarReceta(String nombre) {
		Receta salida = null;
		int i = 0;
		while (i<arrayRecetas.size() && salida == null) {
			if(arrayRecetas.get(i).getNombre().equals(nombre)) {
				salida = arrayRecetas.get(i);
			}else {
				i++;
			}
		}
		return salida;
	}

	public ArrayList<Receta> recetasPosiblesAPreparar(Heladera heladera, Alacena alacena, int cantPorciones){
		listaRecetas = new ArrayList<Receta>();
		for(Receta rec: arrayRecetas) {
			if(rec.esPosible(heladera, alacena, cantPorciones)) {
				listaRecetas.add(rec);
			}
		}
		return listaRecetas;
	}
	
	public void listado2(ArrayList<Receta> lst) {
		for(Receta r: lst) {
			System.out.println(r.getNombre());
		}
	}

}
