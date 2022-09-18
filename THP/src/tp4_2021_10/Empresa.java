package tp4_2021_10;

import java.util.ArrayList;

public class Empresa {
	
	private String nombre;
	private ArrayList<Carrera> arrayCarreras;
	
	public Empresa(String nombre) {
		this.nombre = nombre;
		arrayCarreras = new ArrayList<Carrera>();
	}
	
	public void agregarCarrera(Carrera c) {
		arrayCarreras.add(c);
	}
	
//	La explotación del método buscarCarrera() de la clase Empresa, que
//	recibiendo como parámetro una fecha, debe devolver una instancia de la
//	Carrera encontrada o null en caso de no existir.
	public Carrera buscarCarrera(String fecha) {
		Carrera salida = null;
		int i = 0;
		while(i<arrayCarreras.size() && salida == null) {
			if (arrayCarreras.get(i).getFecha().equals(fecha)) {
				salida = arrayCarreras.get(i);
			}else {
				i++;
			}
		}
		return salida;
	}
	
//	La explotación del método pilotosPorCarrera() de la clase Empresa que
//	no recibe ningún parámetro y debe crear y devolver una lista con la cantidad
//	de pilotos que participaron en cada una de las fecha de las carreras
	public ArrayList<Integer> pilotosPorCarrera(){
		ArrayList<Integer> listaCantPilotos = new ArrayList<Integer>();
		for(Carrera c: arrayCarreras) {
			listaCantPilotos.add(c.cantPilotos());
		}
		return listaCantPilotos;
	}
}
