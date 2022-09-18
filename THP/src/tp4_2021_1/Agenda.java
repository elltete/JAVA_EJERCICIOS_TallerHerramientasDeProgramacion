package tp4_2021_1;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Persona> personas;

	public Agenda() {
		this.personas = new ArrayList<Persona>();
	}

	private Persona buscarPersona(String dni) {
		int i=0;
		Persona personaActual = null;
		while (i<personas.size() && personaActual == null) {
			Persona p = personas.get(i);
			if(p.getDni().equals(dni)) {
				personaActual = p;
			}
			i++;
		}
		return personaActual;
	}
	
	public int sizeAgenda() {
		return personas.size();
	}

	public boolean agregarPersona(String dni, String nombre, String apellido, String domicilio) {
		boolean respuesta = false;
		if(buscarPersona(dni) == null) {
			personas.add(new Persona(dni, nombre, apellido, domicilio));
			respuesta = true;
		}
		return respuesta;
	}

	public Persona removerPersona(String dni) {
		Persona personaActual = buscarPersona(dni);
		if( personaActual != null) {
			personas.remove(personaActual);
		}
		return personaActual;
	}

	public boolean modificarDomicilio(String dni, String domicilio) {
		boolean respuesta = false;
		Persona personaActual = buscarPersona(dni); 
		if(personaActual != null) {
			personaActual.setDomicilio(domicilio);
			respuesta = true;
		}

		return true;
	}

	public void listarPersonas() {
		for(Persona p: personas) {
			System.out.println(p.toString());
		}
	}

	public Persona devolverUltimo() {
		Persona p = null;
		if(personas.size()>0 ) {
			p = personas.get(personas.size()-1);
		}
		return p;
	}

	public void eliminarTodosElementosAMano() {
		while(personas.size()>0) {
			personas.remove(0);
		}
	}
}
