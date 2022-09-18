package tp4_2021_9;

public class test {

	public static void main(String[] args) {

		Institucion ORT = new Institucion("ORT");
		Carrera sistemas = new Carrera("Sistemas"); 		ORT.agregarCarrera(sistemas);
		
		
		Alumno a1 = new Alumno("A1", "diego@com"); 		Alumno a2 = new Alumno("A2", "diego@com");
		Alumno a3 = new Alumno("A3", "diego@com");		Alumno a4 = new Alumno("A4", "diego@com");
		Alumno a5 = new Alumno("A5", "diego@com");		Alumno a6 = new Alumno("A6", "diego@com");
		Alumno a7 = new Alumno("A7", "diego@com");		Alumno a8 = new Alumno("A8", "diego@com");
		Alumno a9 = new Alumno("A9", "diego@com");

		sistemas.agregarAlumno(a1);		sistemas.agregarAlumno(a2);
		sistemas.agregarAlumno(a3);		sistemas.agregarAlumno(a4);
		sistemas.agregarAlumno(a5);		sistemas.agregarAlumno(a6);
		sistemas.agregarAlumno(a7);		sistemas.agregarAlumno(a8);
		sistemas.agregarAlumno(a9);
		
		a1.agregarMateria(new Materia("THP", 9));
		a1.agregarMateria(new Materia("FDP", 9));
		a1.agregarMateria(new Materia("ORG", 4));
		a1.agregarMateria(new Materia("MAT", 4));
		a1.agregarMateria(new Materia("IIF", 4));
		
		a2.agregarMateria(new Materia("THP", 8));
		a2.agregarMateria(new Materia("FDP", 8));
		a2.agregarMateria(new Materia("ORG", 8));
		a2.agregarMateria(new Materia("MAT", 8));
		a2.agregarMateria(new Materia("IIF", 8));
		
		a3.agregarMateria(new Materia("THP", 7));
		a3.agregarMateria(new Materia("FDP", 7));
		a3.agregarMateria(new Materia("ORG", 7));
		a3.agregarMateria(new Materia("MAT", 7));
		a3.agregarMateria(new Materia("IIF", 7));
		
		a4.agregarMateria(new Materia("THP", 6));
		a4.agregarMateria(new Materia("FDP", 6));
		a4.agregarMateria(new Materia("ORG", 6));
		a4.agregarMateria(new Materia("MAT", 6));

		
		a5.agregarMateria(new Materia("THP", 9));
		a5.agregarMateria(new Materia("FDP", 9));
		a5.agregarMateria(new Materia("ORG", 9));
		a5.agregarMateria(new Materia("MAT", 9));
		a5.agregarMateria(new Materia("IIF", 9));
		
		a6.agregarMateria(new Materia("THP", 8));
		a6.agregarMateria(new Materia("FDP", 8));
		a6.agregarMateria(new Materia("ORG", 8));
		a6.agregarMateria(new Materia("MAT", 8));
		a6.agregarMateria(new Materia("IIF", 8));
		
		a7.agregarMateria(new Materia("THP", 7));
		a7.agregarMateria(new Materia("FDP", 7));
		a7.agregarMateria(new Materia("ORG", 7));
		a7.agregarMateria(new Materia("MAT", 7));
		a7.agregarMateria(new Materia("IIF", 7));
		
		a8.agregarMateria(new Materia("THP", 6));
		a8.agregarMateria(new Materia("FDP", 6));
		a8.agregarMateria(new Materia("ORG", 6));
		a8.agregarMateria(new Materia("MAT", 6));
		a8.agregarMateria(new Materia("IIF", 6));
		
		a9.agregarMateria(new Materia("THP", 9));
		a9.agregarMateria(new Materia("FDP", 9));
		a9.agregarMateria(new Materia("ORG", 9));
		a9.agregarMateria(new Materia("MAT", 9));

		
		System.out.println(sistemas.obtenerCandidatos(7));

	}

}
