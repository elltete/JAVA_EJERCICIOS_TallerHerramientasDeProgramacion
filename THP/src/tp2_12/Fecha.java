package tp2_12;

public class Fecha {

	private int dia;
	private int mes;
	private int anio;
	
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	@Override
	public String toString() {
		return "[dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}
	
	
}
