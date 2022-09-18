package tp2_4;

import java.util.Scanner;

import tp2_3.Persona;
import tp2_3.Vehiculo;

public class test {

	public final static String MANEJA = "Maneja";
	public final static String NO_MANEJA = "No Maneja";	
	public final static String SIN_AUTO = "No tiene vehiculo";
	public final static char SI = 'S';
	public final static char NO = 'N';
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		char ingreso;

		Vehiculo vehic1 = new Vehiculo();
		Vehiculo vehic2 = new Vehiculo("Ford", "KA", "Blanco", 200);

		Persona pers1 = new Persona();
		Persona pers2 = new Persona("Fulano", "Gomez", "1111111", false, vehic2);

		pers1.setVehiculo(vehic1);

		System.out.println(vehic1.toString());
		System.out.println(vehic2.toString());

		System.out.println(pers1.toString());	
		System.out.println(pers2.toString());

		do {
			System.out.println(pers2.getNombreCompleto() + " aprendiste a conducir y tenes registro? (S/N): ");
			ingreso = input.nextLine().toUpperCase().charAt(0);
			System.out.println(ingreso);
		}while((ingreso != SI) && (ingreso != NO));
		
		if(!pers2.getCarnetConducir() && (ingreso == SI)) {
			pers2.setCarnetConducir(true);
			System.out.println("A " + pers2.getNombreCompleto() + " se le agrego la condicion de conducir.");
		}else {
			System.out.println(pers2.getNombreCompleto() + " aun no podes manejar.");			
		}
	}

}
