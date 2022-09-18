package tp2_13;

public class Computadora {
	
	final static String NO_ENCENDER = "No se puede encender";
	final static String ESTA_ENCENDIDA = "la computadora esta encendida";
	final static String APAGADA = "la computadora esta apagada";
	final static String NO_APAGAR = "No se puede encender";
	final static String ESTA_APAGADO = "No se puede apagar";
	final static String ENCENDIENDO = 	"Incendiendo la computadora" ;
	final static String APAGANDO = "Apagando la computadora";
	final static String REINICIANDO = "Reiniciando la computadora";
	final static String NO_REINICIAR = "No se puede reiniciar";
	
	private String marca;
	private TipoComputadora tipo;
	private Procesador procesador;
	private DVD dvd;
	private boolean encendida;
	
	public Computadora(String marca, TipoComputadora compu, Procesador pro, DVD dvd) {					
		this.marca = marca;
		this.tipo = compu;
		this.procesador = pro;
		this.dvd = dvd;
	}	
	
	public void setProcesador(Procesador valor) {
		this.procesador = valor;
	}

	public void setDvd(DVD valor) {
		this.dvd = valor;
	}
	
	public void setEncendida(boolean valor) {
		this.encendida = valor;
	}
	
	public DVD getDVD() {
		return this.dvd;
	}
	
	public Procesador getProcesador() {
		return this.procesador;
	}

	public void prender() {
		if (!this.encendida) {
			System.out.println(ENCENDIENDO);
			this.setEncendida(true);
		}
		else {
			System.out.println(NO_ENCENDER + " " + ESTA_ENCENDIDA);			
		}
	}
	
	public void apagar() {
		if (this.encendida) {
			System.out.println(APAGANDO);
			this.setEncendida(false);
		}
		else {
			System.out.println(ESTA_APAGADO + " " + APAGADA);			
		}
	}

	public void reiniciar() {
		if (this.encendida) {
			System.out.println(REINICIANDO);
		}
		else {
			System.out.println(ESTA_APAGADO + " " + NO_REINICIAR);			
		}
	}

//	@Override
//	public String toString() {
//		return "COMPUTADORA [marca=" + marca + ", tipo=" + tipo + ", procesador=" + procesador + ", dvd=" + dvd
//				+ ", encendida=" + encendida + "]";
//	}

	@Override
	public String toString() {
		return "COMPUTADORA [marca=" + marca + ", tipo=" + tipo + "] DVD " + this.dvd.toString() + " PROCESADOR " 
				+ this.procesador.toString();
	}
	
}
