package ParcialReservaAsientosVuelo;

public class Asiento {
	
	private final static double PRECIO_TURISTA = 50000;
	private final static double PRECIO_BUSINESS = 100000;
	private final static double PRECIO_PRIMERA = 150000;

	private Pasajero pasajero;
	private TipoClase clase;
	private double precio;
	
	public Asiento(Pasajero pasajero, TipoClase clase) {
		this.pasajero = pasajero;
		this.clase = clase;
		setPrecioSegunClase(clase);
	}

	private void setPrecioSegunClase(TipoClase clase) {
		if(clase == TipoClase.BUSINESS) {
			precio = Asiento.PRECIO_BUSINESS;
		}else if(clase == TipoClase.PRIMERA) {
			precio = Asiento.PRECIO_PRIMERA;
		}else {
			precio = Asiento.PRECIO_TURISTA;
		}
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public TipoClase getClase() {
		return clase;
	}

	public double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "Asiento [pasajero=" + pasajero + ", clase=" + clase + ", precio=" + precio + "]";
	}
	
}
