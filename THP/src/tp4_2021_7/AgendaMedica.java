package tp4_2021_7;

import java.util.ArrayList;

public class AgendaMedica {

	private ArrayList<Paciente> arrayPacientes;
	private ArrayList<Turno> arrayTurnos;
	private int cantidadTurnos;

	public AgendaMedica(int cantidadTurnos) {
		arrayPacientes = new ArrayList<Paciente>();
		arrayTurnos = new ArrayList<Turno>();
		this.cantidadTurnos = cantidadTurnos;
	}

	private Turno buscarTurno(String dni) {
		Turno salida = null;
		int i=0;
		while(i<arrayTurnos.size() && salida == null) {
			if(arrayTurnos.get(i).getDni().equals(dni)) {
				salida = arrayTurnos.get(i);
			}else {
				i++;
			}
		}
		return salida;
	}

	private Paciente buscarPaciente(String dni) {
		Paciente salida = null;
		int i=0;
		while(i<arrayPacientes.size() && salida == null) {
			if(arrayPacientes.get(i).getDni().equals(dni)) {
				salida = arrayPacientes.get(i);
			}else {
				i++;
			}
		}
		return salida;
	}

	public StatusRegistrarTurno registrarTurno(String dni, String nombre, String apellido, String telefono) {
		StatusRegistrarTurno status = StatusRegistrarTurno.TURNO_CONFIRMADO;
		if(arrayTurnos.size()>=cantidadTurnos) {
			status = StatusRegistrarTurno.SIN_TURNOS;			
		}else {
			if(buscarTurno(dni) != null) {
				status = StatusRegistrarTurno.TURNO_YA_ASIGNADO;				
			}else {
				if(buscarPaciente(dni) == null) {
					arrayPacientes.add(new Paciente(dni, nombre, apellido, telefono));
				}
				arrayTurnos.add(new Turno(dni));
			}
		}
		return status;
	}

	public void listarTurnos() {
		for(Turno t: arrayTurnos) {
			System.out.println(buscarPaciente(t.getDni()).listado() + t.listado());
		}
	}

	public boolean darPresente(String dni) {
		boolean salida = false;
		Turno t= buscarTurno(dni);
		if(t != null) {
			t.actualizarPresencia();
			salida = true;			
		}
		return salida;
	}

	public boolean anularTurno(String dni) {
		boolean salida = false;
		Turno t= buscarTurno(dni);
		if(t != null) {
			arrayTurnos.remove(t);
			salida = true;			
		}
		return salida;
	}

	public ArrayList<Paciente> obtenerAusente(){
		ArrayList<Paciente> arrayAusentes = new ArrayList<Paciente>();
		for(Turno t: arrayTurnos) {
			if(!t.isPresencia()) {
				arrayAusentes.add(buscarPaciente(t.getDni()));
			}
			
		}
		return arrayAusentes;
	}

	public void listarAusentes() {
		for(Paciente t: obtenerAusente()) {
			System.out.println(t.listado());
		}
	}
	
}