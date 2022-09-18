package tp4_2020_4;

import java.util.ArrayList;

public class Concesionaria {
	
	private String nombre;
	private ArrayList<Auto> arrayAutos;
	
	public Concesionaria(String nombre) {
		this.nombre = nombre;
		arrayAutos = new ArrayList<Auto>();
	}
	
	public ArrayList<Auto> getArrayList(){
		return arrayAutos;
	}
	
	public void mostrarListadoMarca(String marca) {
		boolean sinResultado=true;
		for (Auto car : arrayAutos) {
			if(car.getMarca().equals(marca)) {
				System.out.println(car.toString());
				sinResultado = false;
			}
		}
		if (sinResultado) {
			System.out.println("Sin resultados para la marca " + marca);
		}
	}

	public void mostarAutos() {
		for (Auto car : arrayAutos) {
			System.out.println(car.toString());
			}
		}
	
	public void mostrarListadoKm(int km) {
		for (Auto car : arrayAutos) {
			if(car.getKm() < km) {
				System.out.println(car.toString());
			}
		}
	}
	
	public void mostrarAutoMayorKm() {
		int maximo = 0;
		Auto cmax = null;
		for (Auto car : arrayAutos) {
			if(car.getKm() > maximo) {
				maximo = car.getKm();
				cmax = car;
			}
		}
		System.out.println(cmax.toString());
	}

}
