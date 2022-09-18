package tp2_3;

import java.util.Scanner;

public class test {

	public final static String MANEJA = "Maneja";
	public final static String NO_MANEJA = "No Maneja";	
	public final static String SIN_AUTO = "No tiene vehiculo";	

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Vehiculo vehic1 = new Vehiculo();
		Vehiculo vehic2 = new Vehiculo("Ford", "KA", "Blanco", 200);

		Persona pers1 = new Persona();
		
		String nombre= ingreseString("Ingrese nombre de la Persona: ");
		String apellido= ingreseString("Ingrese apellido de la Persona: ");
		
		Persona pers2 = new Persona(nombre, apellido, ingreseString("Ingrese DNI: "), true, vehic2);

		pers1.setVehiculo(vehic1);

		System.out.println(vehic1.toString());	
		System.out.println(vehic2.toString());	

		System.out.println(pers1.toString());		
		System.out.println(pers2.toString());	

		// PREGUNTAR SI LAS PERSONAS QUE TIENEN VEHICULOS SABEN MANEJAR

		if (pers1.getVehiculo() == null) {
			System.out.println(SIN_AUTO);
		}else {
			if (pers1.getCarnetConducir()) {
				System.out.println(MANEJA);	
			}else {
				System.out.println(NO_MANEJA);
			}
		}

		if (pers2.getVehiculo() == null) {
			System.out.println(SIN_AUTO);
		}else {
			if (pers2.getCarnetConducir()) {
				System.out.println(MANEJA);	
			}else {
				System.out.println(NO_MANEJA);
			}
		}
	}

	public static String ingreseString(String n) {
		String s;
		do {
			System.out.println(n);
			s = input.nextLine();
		}while(s.isEmpty());
		return s;		
	}

}
