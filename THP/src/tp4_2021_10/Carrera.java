package tp4_2021_10;

import java.util.ArrayList;

public class Carrera {
	
	final static int VUELTAS_MIN= 3;
	
	private int hora;
	private String fecha;
	private Dificultad tipoDificultad;
	private ArrayList<Piloto> arrayPilotos;
	
	public Carrera(int hora, String fecha, Dificultad tipoDificultad) {
		this.hora = hora;
		this.fecha = fecha;
		this.tipoDificultad = tipoDificultad;
		arrayPilotos = new ArrayList<Piloto>();
	}
	
	public void agregarPiloto(Piloto p) {
		arrayPilotos.add(p);
	}
	
//	La explotación del método buscarPilotosPorDebajoDe() de la clase
//	Carrera y que recibe como parámetro un valor en segundos para devolver
//	una lista de aquellos pilotos que hayan realizado al menos 10 vueltas y cuyo
//	promedio de tiempo no supere los segundos enviados por parámetro.
	public ArrayList<Piloto> buscarPilotosPorDebajoDe(int tiempo){
		ArrayList<Piloto> listaPilotos = new ArrayList<Piloto>();
		for(Piloto p: arrayPilotos) {
			if(p.validarVueltas(VUELTAS_MIN) && p.calcularPromedio()<tiempo) {
				listaPilotos.add(p);
			}
		}
		return listaPilotos;
	}
	
//	La explotación del método mostrarMenorPromedio() de la clase Carrera
//	que no recibe ningún parámetro y debe mostrar por pantalla el nombre y dni
//	del piloto con menor promedio
	public void mostrarMenorPromedio() {
		Piloto salida = null;
		double menorPromedio = Double.MAX_VALUE;
		for(Piloto p: arrayPilotos) {
			if(p.calcularPromedio() < menorPromedio) {
				menorPromedio = p.calcularPromedio();
				salida = p;
			}
		}
		if(salida != null) {
			System.out.println("El Piloto de menor promedio es " + salida.getNombre() + " con dni " + salida.getDni());
		}else {
			System.out.println("No hay pilotos");
		}
	}
	
	public int cantPilotos() {
		return arrayPilotos.size();
	}

	public String getFecha() {
		return fecha;
	}
	
	public void print() {
		System.out.println(this.fecha);
	}

}
