package tp4_2020_4;

import java.util.ArrayList;
import java.util.Scanner;

public class test {

	private static Scanner input = new Scanner(System.in);
	final static String SALIR = "F";
	final static char A = 'A';
	final static char B = 'B';
	final static char C = 'C';
	final static char D = 'D';
	final static char S = 'S';
	final static char N = 'N';
	final static char FIN = 'F';


	public static void main(String[] args) {

		//CREACION DE LA CONCESIONARIA

		Concesionaria cars = new Concesionaria("AUTOMOTRIZ");

		//INGRESO DE LOS AUTOS
		boolean menu = false;
		String matricula = ingreseMatricula();

		while (!matricula.equals(SALIR) ){
			menu = true;
			String marca = ingreseMarca();
			String modelo = ingreseModelo();			
			int km = ingreseKm();

			Auto auto = new Auto(matricula, marca, modelo, km);
			cars.getArrayList().add(auto);

			matricula = ingreseMatricula();
		}
		if (menu) {
			mostrarMenu(cars);
		}
		System.out.println("Fin del sistema");
		input.close();

	}

	public static String ingreseMatricula() {
		System.out.println("Ingrese matricula (F=Salir): ");
		String matricula =  input.nextLine().toUpperCase();
		return matricula;
	}

	public static String ingreseMarca() {
		System.out.println("Ingrese marca: ");
		String marca =  input.nextLine().toUpperCase();
		return marca;
	}

	public static String ingreseModelo() {
		System.out.println("Ingrese modelo: ");
		String modelo =  input.nextLine().toUpperCase();
		return modelo;
	}

	public static int ingreseKm() {
		System.out.println("Ingrese km: ");
		int km =  Integer.parseInt(input.nextLine());
		return km;
	}

	public static void mostrarMenu(Concesionaria c) {
		char op1, op2;
		do {
			do {
				System.out.println("*** ELIJA OPCION ***");		
				System.out.println("A. Todos los autos introducidos");
				System.out.println("B. Todos los autos de una marca determinada");
				System.out.println("C. Todos los autos con menos de un número determinado de Kilómetros");
				System.out.println("D. El auto con mayor número de Kilómetros");
				op1 = input.nextLine().toUpperCase().charAt(0);
			}while (op1 != A && op1 != B && op1 != C && op1 != D);
			ejecutarOpcion(op1,c);
			do {
				System.out.println("*** Desea seguir? (S/N): ");
				op2 = input.nextLine().toUpperCase().charAt(0);
			}while (op2 != N && op2 != S);

		}while (op2 != N);
	}

	public static void ejecutarOpcion(char op1, Concesionaria c) {
		switch (op1) {
		case A:
			c.mostarAutos();
			break;
		case B:
			System.out.println("Ingrese marca: ");
			String marca = input.nextLine().toUpperCase();
			c.mostrarListadoMarca(marca);
			break;
		case C:
			System.out.println("Ingrese km: ");
			int km = Integer.parseInt(input.nextLine());
			c.mostrarListadoKm(km);
			break;
		case D:
			c.mostrarAutoMayorKm();
			break;
		}
	}

}
