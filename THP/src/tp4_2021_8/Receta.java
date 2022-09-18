package tp4_2021_8;

import java.util.ArrayList;

public class Receta {
	
	private String codigo;
	private String nombre;	
	ArrayList<Ingrediente> arrayIngredientes;
	ArrayList<Ingrediente> listaIngrediente;
	
	public Receta(String codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
		arrayIngredientes = new ArrayList<Ingrediente>();
	}
	
	public void agregarIngrediente(Ingrediente ing) {
		arrayIngredientes.add(ing);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public ArrayList<Ingrediente> devolverIngredientes(int cantPorciones, Heladera heladera, Alacena alacena){
		listaIngrediente = new ArrayList<Ingrediente>();
		for (Ingrediente in: arrayIngredientes) {
			if(in.isEsRefrigerado()) {
				int cantDisponible = heladera.productoDisponible(in.getNombre());
				int cant = in.getCantidad()*cantPorciones - cantDisponible;
				if (cant>0) {
					listaIngrediente.add(new Ingrediente(in.getNombre(), cant, true));
				}
			}else {
				int cantDisponible = alacena.productoDisponible(in.getNombre());
				int cant = in.getCantidad()*cantPorciones - cantDisponible;
				if (cant>0) {
					listaIngrediente.add(new Ingrediente(in.getNombre(), cant, false));
				}
			}
		}
		return listaIngrediente;
	}
	
	public boolean esPosible(Heladera heladera, Alacena alacena, int cantPorciones){
		boolean salida = false;
		int i = 0;
		while (i<arrayIngredientes.size() && !salida) {
			if(arrayIngredientes.get(i).isEsRefrigerado()) {
				int cantDisponible = heladera.productoDisponible(arrayIngredientes.get(i).getNombre());
				int cant = cantDisponible - arrayIngredientes.get(i).getCantidad()*cantPorciones;
				if (cant>0) {
					salida = true;
				}
			}else {
				int cantDisponible = alacena.productoDisponible(arrayIngredientes.get(i).getNombre());
				int cant = cantDisponible - arrayIngredientes.get(i).getCantidad()*cantPorciones;
				if (cant>0) {
					salida = true;
				}
			}
			i++;
		}
		return salida;
	}
}
