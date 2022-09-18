package tp4_2021_10;

import java.util.ArrayList;

public class Piloto {
	
	private String nombre;
	private String dni;
	private ArrayList<Vuelta> arrayVueltas;
	
	public Piloto(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
		arrayVueltas = new ArrayList<Vuelta>();
	}
	
	public void agregarVuelta(Vuelta v) {
		arrayVueltas.add(v);
	}

//	La explotación del método calcularPromedio() de la clase Piloto, que debe
//	calcular el promedio de tiempo de dicho piloto entre todas las vueltas que
//	haya realizado.
	public double calcularPromedio() {
		double salida = 0;
		if(arrayVueltas.size()!=0) {
			salida = Matematica.obtenerPromedio(totalVueltas(), arrayVueltas.size());
		}
		return salida;
	}
	
	private double totalVueltas(){
		double total = 0;
		for(Vuelta v: arrayVueltas) {
			total += v.getTiempo();
		}
		return total;		
	}

	public boolean validarVueltas(int vueltas) {
		boolean salida = false;
		if (arrayVueltas.size()>=vueltas) {
			salida = true;
		}
		return salida;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}
	
	
}
