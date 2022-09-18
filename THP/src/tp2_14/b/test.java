package tp2_14.b;

import java.util.Scanner;

public class test {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		double nota = 0;

		Materia matematicas = new Materia("Matematicas");

		System.out.println("Ingrese nota (Fin=-1): ");
		nota = Integer.parseInt(input.nextLine());
		
		while (nota>=0) {
			matematicas.ingresar(nota);
			System.out.println("Ingrese nota (Fin=-1): ");
			nota = Integer.parseInt(input.nextLine());
		}
		
		System.out.println(matematicas.obtenerPromedio());
		input.close();
	}
}	
