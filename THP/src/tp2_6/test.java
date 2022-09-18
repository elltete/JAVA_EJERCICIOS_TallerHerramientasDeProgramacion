package tp2_6;

import java.util.Scanner;

public class test {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(args.length);
		
		char menu;
		
		//1ro: generar una persona, indicando dni, nombre, apellido, fecha de nacimiento, calle, numero y barrio
		
		//2do: generar cuenta, indicando tipo de cuenta y persona generada
		
		Persona pers1 = new Persona("12345678", "Fulano", "Gomez", "29/06/1974", "Yatay", 240, "Almagro");
		Persona pers2 = new Persona("90123456", "Mengana", "Torres", "29/06/1974", "Yatay", 240, "Almagro");
		
		CuentaBancaria cuenta1 = new CuentaBancaria(TipoCuenta.CUENTACORRIENTE, pers1);
		CuentaBancaria cuenta2 = new CuentaBancaria(TipoCuenta.CAJADEAHORRO, pers2);
		
		System.out.println(cuenta1.toString());

		do{
			menu = mostrarMenu(cuenta1);
		}while(menu!='F');
		
		if(pers1.mismoDomicilio(pers2)) {		
			System.out.println(cuenta1.toString2());
			System.out.println(cuenta2.toString2());
			System.out.println("Viven en la misma direccion.");
		}
		
		input.close();
	}
	
	
	public static char mostrarMenu(CuentaBancaria cuenta1) {
		System.out.println("\nOPERACION CUENTA BANCARIA");		
		System.out.println("	1. Consultar Saldo.");
		System.out.println("	2. Depositar Dinero.");
		System.out.println("	3. Extraer dinero.");
		System.out.println("	4. Mostrar datos.");
		System.out.println("Que operacion quiere realizar (F=FIN):");
		char opcion= input.nextLine().toUpperCase().charAt(0);
		switch (opcion){
			case '1':{
				System.out.println("El Saldo de la cuenta es: " + cuenta1.verSaldo());
				break;
			} 
			case '2':{
				System.out.println("El Saldo de la cuenta es: " + cuenta1.verSaldo());
				System.out.println("Ingrese el valor a depositar: ");
				int valor = Integer.parseInt(input.nextLine());
				cuenta1.depositar(valor);
				System.out.println("El Saldo de la cuenta es: " + cuenta1.verSaldo());
				break;
			}
			case '3':{
				System.out.println("El Saldo de la cuenta es: " + cuenta1.verSaldo());
				System.out.println("Ingrese el valor a extraer: ");
				int valor = Integer.parseInt(input.nextLine());
				if(cuenta1.extraer(valor)) {
					System.out.println("Retire el monto.");
					System.out.println("El Saldo de la cuenta es: " + cuenta1.verSaldo());
				}else {
					System.out.println("Saldo insuficuente.");
					System.out.println("El Saldo de la cuenta es: " + cuenta1.verSaldo());
				}				
				break;
			}
			case '4':{
				System.out.println(cuenta1.toString2());
				break;
			}
			case 'F':{
				System.out.println("Finalizo el programa.");
				break;
			}
			default:{
				System.out.println("Opcion invalida");
			}
				
		}
		return opcion;
	}

}
