package tp2_14;

import java.util.Scanner;

public class test {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		double nota = 0;

		Promedio matematica = new Promedio();

		System.out.println("Ingrese nota (Fin=-1): ");
		nota = Integer.parseInt(input.nextLine());
		
		while (nota>=0) {
			matematica.incrementar(nota);
			System.out.println("Ingrese nota (Fin=-1): ");
			nota = Integer.parseInt(input.nextLine());			
		}
		
		System.out.println(matematica.obtenerValor());
		input.close();
	}
}	
