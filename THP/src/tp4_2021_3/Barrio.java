package tp4_2021_3;

import java.util.ArrayList;

public class Barrio {

	private String nombre;
	private ArrayList<Propiedad> arrayPropiedades;
	
	public Barrio(String nombre) {
		this.nombre = nombre;
		arrayPropiedades = new ArrayList<Propiedad>();
	}
	
	public void agregarPropiedad(Propiedad prop) {
		arrayPropiedades.add(prop);
	}

	public void mostrarPropiedades(Tipo tipo) {
		for(Propiedad p: arrayPropiedades) {
			if(p.getTipo().equals(tipo)) {
				System.out.println(p.toString());
			}
		}
	}
	
	public void mostrarPropiedades() {
		for(Propiedad p: arrayPropiedades) {
				System.out.println(p.toString());
		}
	}
	
	public int sizePropiedades() {
		return arrayPropiedades.size();
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public Propiedad borrarPropiedad(String domicilio){
		Propiedad p = null;
		for(int i=0; i<arrayPropiedades.size(); i++) {
			if(arrayPropiedades.get(i).getDomicilio().equals(domicilio)) {
				p = arrayPropiedades.remove(i);
			}
		}
		return p;
	}
}
