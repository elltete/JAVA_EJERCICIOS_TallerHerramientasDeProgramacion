package tp4_2021_3;

import java.util.ArrayList;

public class Inmobiliaria {

	private String nombre;
	private ArrayList<Barrio> arrayBarrios;

	public Inmobiliaria(String nombre) {
		this.nombre = nombre;
		arrayBarrios = new ArrayList<Barrio>();
	}

	public void agregarBarrio(Barrio barrio) {
		arrayBarrios.add(barrio);
	}

	public void mostrarPropiedades() {
		for(Barrio b: arrayBarrios) {
			b.mostrarPropiedades();
		}
	}

	public void obtenerBarrioMaxProp() {
		int valorMaximo = 0;
		for(Barrio b: arrayBarrios) {
			if(b.sizePropiedades()>valorMaximo) {
				valorMaximo = b.sizePropiedades();
			}
		}
		System.out.println("Listado de Barrios con Maximas Propiedades");
		for(Barrio b: arrayBarrios) {
			if(b.sizePropiedades()==valorMaximo) {
				System.out.println(b.getNombre());
			}
		}	

	}

	public void borrarPropiedad(String domicilio) {
		for(Barrio b: arrayBarrios) {
			b.borrarPropiedad(domicilio);
		}
	}

	public void cambiarPropiedadDeBarrio(String domicilio, String barrio) {
		Propiedad p;
		for(Barrio b: arrayBarrios) {
			p = b.borrarPropiedad(domicilio);
			if(p!=null) {
				cambio(barrio,p);
			}
		}
	}

	private void cambio(String barrio, Propiedad prop) {
		for(int i=0;i<arrayBarrios.size();i++){
			if(arrayBarrios.get(i).getNombre().equals(barrio)){
				arrayBarrios.get(i).agregarPropiedad(prop);
			}
		}
	}
}
