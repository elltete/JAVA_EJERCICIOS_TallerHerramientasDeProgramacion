package tp2_1;

public class MaquinaDeCafe {
	
	final static String NO_ENCENDER = "No se puede encender";
	final static String ESTA_ENCENDIDO = "la maquina esta encendida";
	final static String NO_APAGAR = "No se puede encender";
	final static String ESTA_APAGADO = "la maquina esta apagada";
	final static String ERROR = "Error en la maquina";
	final static String PREPARANDO = "Preparando Infusion";	
	
	private int nivelAgua;
	private int cantDeVasos;
	private boolean encendido;

	public MaquinaDeCafe() {
		nivelAgua = 0;
		cantDeVasos = 0;
		encendido = false;
	}
	
	public MaquinaDeCafe(int nivel, int cant, boolean valor) {
		nivelAgua = nivel;
		cantDeVasos = cant;
		encendido = valor;
	}
	
	public void setNivelAgua(int nivel) {
		this.nivelAgua = nivel;
	}
	
	public void setCantDeVasos(int cant) {
		this.cantDeVasos = cant;
	}
	
	public void setEncendido(boolean enc) {
		this.encendido = enc;
	}
	
	public int getNivelAgua() {
		return this.nivelAgua;
	}
	
	public int getCantDeVasos() {
		return this.cantDeVasos;
	}
	
	public boolean getEncendido() {
		return this.encendido;
	}
	
	public void prender() {
		if (!this.encendido) 
			this.encendido = true;
		else
			System.out.println(NO_ENCENDER + " " + ESTA_ENCENDIDO);	
	}
	
	public void apagar() {
		if (this.encendido)
			this.encendido = false;
		else
			System.out.println(NO_APAGAR + " " + ESTA_APAGADO);	
	} 
	
	public void prepararInfusion() {
		if (this.encendido && this.nivelAgua>0 && this.cantDeVasos>0)
			System.out.println(PREPARANDO);
		else
			System.out.println(ERROR);	
	} 
}
