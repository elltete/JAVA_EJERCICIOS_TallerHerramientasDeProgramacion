package ParcialVacacionesInvierno;

import java.util.ArrayList;

public class Inmobiliaria {
	
	private String nombre;
	private ArrayList<Propiedad> arrayPropiedades;
	
	public Inmobiliaria(String nombre) {
		this.nombre = nombre;
		arrayPropiedades = new ArrayList<Propiedad>();
	}
	
	public void ingresarPropiedad(String direccion, int ambiente, Zona zona, double precio) {
		
		if (buscarPropiedad(direccion)==null) {
			arrayPropiedades.add(new Propiedad(direccion, ambiente, zona, precio));
			System.out.println("Propiedad creada");
		}else {
			System.out.println("Propiedad ya existe");
		}
	}
	
	private Propiedad buscarPropiedad(String direccion){
		Propiedad propiedad = null;
		int i = 0;
		while(i<arrayPropiedades.size() && propiedad == null) {
			if(arrayPropiedades.get(i).getDireccion().equals(direccion)) {
				propiedad = arrayPropiedades.get(i);
			}else {
				i++;
			}
		}
		return propiedad;
	}
	
	public void alquilarPropiedad(String direccion) {
		Propiedad propiedad = buscarPropiedad(direccion);
		if (propiedad==null) {
			System.out.println("Propiedad no existe");
		}else {
			if(propiedad.estaAlquilada()) {
				System.out.println("Propiedad esta alquilada");
				System.out.println(getPropiedadesLibres(propiedad.getAmbiente(), propiedad.getZona()));
			}else {
				propiedad.pasarAlquilada();
				System.out.println("Alquiler efectuado");
			}
		}
	}
	
	private ArrayList<Propiedad> getPropiedadesLibres(int ambiente, Zona zona){
		ArrayList<Propiedad> listadoProp = new ArrayList<Propiedad>();
		for(Propiedad p: arrayPropiedades) {
			if(p.getZona().equals(zona) && p.getAmbiente()==ambiente && !p.estaAlquilada()) {
				listadoProp.add(p);
			}
		}
		return listadoProp;
	}
	
	public void mostrarPropiedadesOcupadas() {
		for(Propiedad p: arrayPropiedades) {
			if(p.estaAlquilada()) {
				System.out.println(p);
			}
		}
	}
	
	public void mostrarPorcentajeOcupacion(Zona zona) {
		int cantPorZona = 0;
		int cantPorZonaOcupada = 0;
		for(Propiedad p: arrayPropiedades) {
			if(p.getZona().equals(zona)) {
				cantPorZona++;
				if(p.estaAlquilada()) {
					cantPorZonaOcupada++;
				}else {
					
				}
			}
		}
		if(cantPorZona == 0) {
			System.out.println("No hay propiedades en la zona " + zona);
		}else {
			System.out.println("El porcentaje de ocupacion en " + zona + " es: " + (double)cantPorZonaOcupada/cantPorZona*100);
		}
	}

}
