package ParcialReservaAsientosVuelo;

public class test {

	public static void main(String[] args) {

		Vuelo AA3313 = new Vuelo("AA3313", 180);
		
		AA3313.reservarAsiento(11111111, 1234567890, TipoClase.PRIMERA);
		AA3313.reservarAsiento(22222222, 1234567891, TipoClase.PRIMERA);
		AA3313.reservarAsiento(33333333, 1234567892, TipoClase.TURISTA);
		AA3313.reservarAsiento(44444444, 1234567894, TipoClase.TURISTA);
		AA3313.reservarAsiento(55555555, 1234567895, TipoClase.BUSINESS);
		AA3313.reservarAsiento(11111111, 1234567890, TipoClase.PRIMERA);
		
		AA3313.mostrarMontoRecaudadoDeClase(TipoClase.PRIMERA);
		AA3313.mostrarMontoRecaudadoDeClase(TipoClase.BUSINESS);
		AA3313.mostrarMontoRecaudadoDeClase(TipoClase.TURISTA);

		AA3313.listarAsientosReservados();
		
		AA3313.anularReserva(55555555);
		AA3313.anularReserva(99999999);
		
		AA3313.mostrarMontoRecaudadoDeClase(TipoClase.BUSINESS);
		
		AA3313.listarAsientosReservados();
	}

}
