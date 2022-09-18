package tp4_2021_9;

import java.util.ArrayList;

public class Carrera {
	
	final static int MAX_CANDIDATOS = 5;
	
	private String nombre;
	ArrayList<Alumno> arrayAlumnos;
	ArrayList<Candidato> arrayCandidatos;
	
	public Carrera(String nombre) {
		this.nombre = nombre;
		arrayAlumnos = new ArrayList<Alumno>();
	}
	
	public void agregarAlumno(Alumno alumno) {
		arrayAlumnos.add(alumno);
	}

	public ArrayList<Candidato> obtenerCandidatos(double promedioMinimo){
		arrayCandidatos = new ArrayList<Candidato>();
		int i = 0;
		int cand = 0;
		while(i<arrayAlumnos.size() && cand<MAX_CANDIDATOS) {
			if(arrayAlumnos.get(i).cumpleCondicion(promedioMinimo)) {
				arrayCandidatos.add(new Candidato(arrayAlumnos.get(i).getNombre(), arrayAlumnos.get(i).getEmail()));
				cand++;
			}
			i++;
		}
		return arrayCandidatos;
	}

}
