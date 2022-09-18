package ParcialReservaAsientosVuelo;

import java.util.ArrayList;

public class Vuelo {
	
	private String numeroVuelo;
	private int cantAsientos;
	private ArrayList<Asiento> listaAsientosReservados;
	private int montoRecuadado = 0;
	
	public Vuelo(String numeroVuelo, int cantAsientos) {
		this.numeroVuelo = numeroVuelo;
		this.cantAsientos = cantAsientos;
		listaAsientosReservados = new ArrayList<Asiento>();
	}

	public ResultadoReservaBoletos reservarAsiento(int dni, int telefono, TipoClase clase) {
		ResultadoReservaBoletos resultado;
		if(avionLleno()) {
			resultado = ResultadoReservaBoletos.Error_avion_completo;
		}else {
			if(buscarAsientoReservado(dni) != null) {
				resultado = ResultadoReservaBoletos.Error_ya_tiene_un_pasaje;				
			}else {
				listaAsientosReservados.add(new Asiento(new Pasajero(dni, telefono), clase));
				resultado = ResultadoReservaBoletos.Reserva_confirmada;				
			}
		}
		System.out.println(resultado);
		return resultado;
	}
	
	private boolean avionLleno() {
		boolean respuesta = false;
		if(listaAsientosReservados.size() == cantAsientos) {
			respuesta = true;
		}
		return respuesta;
	}
	
	private Asiento buscarAsientoReservado(int dni) {
		Asiento asientoReservado = null;
		int i = 0;
		while(i<listaAsientosReservados.size() && asientoReservado == null) {
			if(listaAsientosReservados.get(i).getPasajero().getDni() == dni) {
				asientoReservado = listaAsientosReservados.get(i);
			}else {
				i++;
			}
		}
		return asientoReservado;
	}
	
	public void listarAsientosReservados() {
		System.out.println("Cantidad de Asientos reservados : " + listaAsientosReservados.size());
		for(Asiento a: listaAsientosReservados) {
			System.out.println(a);
		}
	}
	
	public void anularReserva(int dni) {
		Asiento asientoEncontrado= buscarAsientoReservado(dni);
		if(asientoEncontrado == null) {
			System.out.println("No existe una reserva con ese DNI");
		}else {
			listaAsientosReservados.remove(asientoEncontrado);
			System.out.println("Se ha anulado la reserva con éxito");
		}
	}
	
	private double obtenerAcumuladoPorClase(TipoClase clase) {
		double cant = 0;
		for(Asiento a: listaAsientosReservados) {
			if(a.getClase().equals(clase)) {
				cant++;
			}
		}
		return cant;
	}
	
	public void mostrarMontoRecaudadoDeClase(TipoClase clase) {
		double valor = 0;
		for(Asiento a: listaAsientosReservados) {
			if(a.getClase().equals(clase)) {
				valor += a.getPrecio();
			}
		}
		if(listaAsientosReservados.isEmpty()) {
			System.out.println("No hay asientos reservados en ninguna clase");
		}else {
			if(valor == 0) {
				System.out.println("No hay asientos reservados para clase " + clase);
			}else {
				System.out.println("El monto acumulado hasta el momento en la clase " + clase + " es: $ " + valor);		
			}
		}
	}		
}
