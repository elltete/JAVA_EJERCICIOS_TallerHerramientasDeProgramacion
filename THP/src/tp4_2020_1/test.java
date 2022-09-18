package tp4_2020_1;

import java.util.ArrayList;
import java.util.Scanner;

public class test {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<Integer>();
		int ingreso;

		for (int i=0; i<10; i++) {
			do {
				System.out.println("Ingresar un numero positivo: ");
				ingreso = Integer.parseInt(input.nextLine());
			} while(ingreso<0);

			lista.add(ingreso);
		}

		System.out.println("Promedio de los numeros ingresados: " + promedio(lista));
		System.out.println("Promedio de los numeros pares: " + promedioPares(lista));	
	}

	static double promedio(ArrayList<Integer> listado) {
		double total=0;
		for(Integer i: listado) {
			total+=i;				
		}
		return total/listado.size();
	}

	static double promedioPares(ArrayList<Integer> listado) {
		double total=0;
		int pares=0, j=2;
		while (j < listado.size()) {
			if(j%2==0) {
				total+=listado.get(j);
				pares++;
			}
			j++;
		}
		return total/pares;
	}
}
