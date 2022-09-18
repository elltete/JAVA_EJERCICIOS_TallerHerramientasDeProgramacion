package Examen;

import java.util.Scanner;

public class Examen {

	final static char MOTO = 'M';
	final static char AUTOMOVIL = 'A';
	final static char CAMIONETA = 'C';
	final static String FIN = "FIN";
	final static int HRPICO_MIN = 9;
	final static int HRPICO_MAX = 18;
	final static double INC_HRPICO = 0.5;	
	final static int COSTO_M = 50;
	final static int COSTO_A = 100;
	final static int COSTO_C = 150;

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		String patente;
		char tipoDeVehiculo;
		int hora, contMoto=0, contVehiculos=0;
		double recaudacion=0, recaudacionTotal=0;
		boolean horaPico = false;

		patente = ingresararPatente();

		while (!patente.equals(FIN)) {
			tipoDeVehiculo = ingresarVehiculo();

			hora = ingresarHora();			

			//CALCULO DEL IMPORTE A PAGAR
			horaPico=false;
			if (hora>=HRPICO_MIN && hora<=HRPICO_MAX) {
				horaPico=true;
			}

			switch (tipoDeVehiculo) {
			case MOTO:
				contMoto++;
				if (horaPico)
					recaudacion = COSTO_M*(1+INC_HRPICO);
				else
					recaudacion = COSTO_M;						
				break;
			case AUTOMOVIL:
				if (horaPico)
					recaudacion = COSTO_A*(1+INC_HRPICO);
				else
					recaudacion = COSTO_M;						
				break;
			case CAMIONETA:
				if (horaPico)
					recaudacion = COSTO_C*(1+INC_HRPICO);
				else
					recaudacion = COSTO_C;						
				break;
			}
			recaudacionTotal += recaudacion;
			contVehiculos++;

			//MENSAJE CUANTO DEBE PAGAR
			System.out.println("El peaje del vehiculo " + patente.replaceAll(" ", "") + " es $" + recaudacion);

			patente = ingresararPatente();

		}

		if (contVehiculos==0) 
			System.out.println("No ingresaron vehiculos.");
		else {
			if (contMoto==0)
				System.out.println("No ingresaron Motos");
			else {
				System.out.println("El porcentaje de Motos es de " + (float)contMoto/contVehiculos*100 + "%");
				System.out.println("El total recaudado es " + recaudacionTotal);
			}
		}

		input.close();
	}

	public static int ingresarHora() {
		int hora;
		do {
			System.out.println("Ingresa la hora (0 a 23): ");
			hora=  Integer.parseInt(input.nextLine());
		}while( hora < 0 || hora > 23);
		return hora;
	}

	public static char ingresarVehiculo() {
		char tipoDeVehiculo;
		do {
			System.out.println("Ingrese tipo de Vehiculo (M)oto (A)utomovil (C)amioneta: ");
			tipoDeVehiculo = input.nextLine().toUpperCase().charAt(0);
		}while(tipoDeVehiculo!=MOTO && tipoDeVehiculo!=AUTOMOVIL && tipoDeVehiculo!=CAMIONETA);
		return tipoDeVehiculo;
	}

	public static String ingresararPatente() {
		String pat;
		do {
			System.out.println("Ingrese numero de Patente - FIN para salir): ");
			pat = input.nextLine().toUpperCase();
		}while (pat.isEmpty());
		return pat;
	}
}
