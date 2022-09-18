package tp4_2020_5;

import java.util.ArrayList;

public class Agenda {
	
	private String nombreAgenda;
	private ArrayList<Persona> arrayPersonas;
	
	public Agenda(String nombre) {
		this.nombreAgenda = nombre;
		arrayPersonas = new ArrayList<Persona>();
	}
	
	public ArrayList<Persona> getArrayPersonas(){
		return arrayPersonas;
	}
	
	public void agregarPersona(Persona pers) {
		arrayPersonas.add(pers);
	}
	
	public void eliminarPersona(String dni) {
		boolean eliminado = false;
		int i = 0;
		while(i < arrayPersonas.size() && !eliminado) {
			if(arrayPersonas.get(i).getDni().equals(dni)) {
				arrayPersonas.remove(i);
				System.out.println("Persona eliminada de la adenda.");
				eliminado = true;
			}
			i++;
		}
	}
	
	public void listarAgenda() {
		for(Persona p: arrayPersonas) {
			System.out.println(p.toString());
		}
	}
	
	public boolean buscarPersona(String dni) {
		boolean encontrado = false;
		int i=0;
		while(i < arrayPersonas.size() && !encontrado) {
			if(arrayPersonas.get(i).getDni().equals(dni)) {
				System.out.println("Persona encontrada." + arrayPersonas.get(i).toString());
				encontrado = true;
			}
			i++;
		}
		return encontrado;
	}

	public boolean buscarPersona(String nombre, String apellido) {
		boolean encontrado = false;
		int i=0;
		while(i < arrayPersonas.size() && !encontrado) {
			if(arrayPersonas.get(i).getNombre().equals(nombre) && arrayPersonas.get(i).getApellido().equals(apellido)) {
				System.out.println("Persona encontrada." + arrayPersonas.get(i).toString());
				encontrado = true;
			}
			i++;
		}
		return encontrado;
	}
}
