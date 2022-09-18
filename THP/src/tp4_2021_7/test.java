package tp4_2021_7;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {

		AgendaMedica agendaDoctor = new AgendaMedica(3);
		
		System.out.println(agendaDoctor.registrarTurno("2020", "D", "P", "11"));
		System.out.println(agendaDoctor.registrarTurno("2020", "D", "P", "11"));
		System.out.println(agendaDoctor.registrarTurno("2021", "D", "P", "11"));
		System.out.println(agendaDoctor.registrarTurno("2022", "D", "P", "11"));
		System.out.println(agendaDoctor.registrarTurno("2023", "D", "P", "11"));
		
		agendaDoctor.listarTurnos();

		System.out.println(agendaDoctor.darPresente("2020"));
		System.out.println(agendaDoctor.darPresente("2021"));
		
		agendaDoctor.listarTurnos();
		
		System.out.println(agendaDoctor.anularTurno("2021"));

		agendaDoctor.listarTurnos();

		System.out.println("agendaDoctor.obtenerAusente");		
		
		agendaDoctor.listarAusentes();
		
	}

}
