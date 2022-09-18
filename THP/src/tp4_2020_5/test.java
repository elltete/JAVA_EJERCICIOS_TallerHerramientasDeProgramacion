package tp4_2020_5;

import java.util.Scanner;

public class test {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		//CREACION DE LA AGENDA
		
		Agenda agenda = new Agenda("PERSONAL");
		
		//CREACION DE PERSONAS y AGREGANDOLAS A AGENDA
		
		Persona pers1 = new Persona("Diego", "Ponzo", "12345678","44444444", "mail@yahoo.com");
		agenda.agregarPersona(pers1);
		Persona pers2 = new Persona("Jorge", "Teran", "87654321","44444444", "mail@yahoo.com");
		agenda.agregarPersona(pers2);
		Persona pers3 = new Persona("Nicolas", "Fantin", "11223344","44444444", "mail@yahoo.com");
		agenda.agregarPersona(pers3);
		Persona pers4 = new Persona("Ines", "Chimondeguy", "44332211","44444444", "mail@yahoo.com");
		agenda.agregarPersona(pers4);
		Persona pers5 = new Persona("Victoria", "Galli", "55667788","44444444", "mail@yahoo.com");
		agenda.agregarPersona(pers5);
		Persona pers6 = new Persona("Franciso", "Giovanetti", "88776655","44444444", "mail@yahoo.com");
		agenda.agregarPersona(pers6);
		Persona pers7 = new Persona("Juan", "Portiglia", "12345678","44444444", "mail@yahoo.com");
		agenda.agregarPersona(pers7);
		Persona pers8 = new Persona("Esteban", "Trabuco", "87654321","44444444", "mail@yahoo.com");
		agenda.agregarPersona(pers8);	

		//BUSCAR EN LA AGENDA A UNA PERSONA POR DNI Y MOSTRAR LOS DATOS	
		
		System.out.println("Ingresar el DNI de la persona a buscar: ");
		String dni = input.nextLine();
		if(!agenda.buscarPersona(dni)){
			System.out.println("No existe Persona con el DNI ingresado");
		}
		
		//BUSCAR EN LA AGENDA A UNA PERSONA POR NOMBRE Y APELLIDO Y MOSTRAR LOS DATOS	
		
		System.out.println("Ingresar el NOMBRE de la persona a buscar: ");
		String nombre = input.nextLine();
		System.out.println("Ingresar el APELLIDO de la persona a buscar: ");
		String apellido = input.nextLine();		
		if(!agenda.buscarPersona(nombre, apellido)){
			System.out.println("No existe Persona ingresada");
		}
		
		//BUSCAR EN LA AGENDA A UNA PERSONA POR DNI Y ELIMINARLA
		
		System.out.println("Ingresar el DNI de la persona a eliminar de la agenda: ");
		dni = input.nextLine();
		if(!agenda.buscarPersona(dni)){
			System.out.println("No existe Persona con el DNI ingresado");
		}else {
			agenda.eliminarPersona(dni);
		}
		
		//LISTAR TODAS LAS PERSONAS DE LA AGENDA
		agenda.listarAgenda();
	
		input.close();
	}

}
