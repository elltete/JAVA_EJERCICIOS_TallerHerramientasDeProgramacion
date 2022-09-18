package tp2_1;

public class TelefonoMovil {
	
	final static String NO_ENCENDER = "No se puede encender";
	final static String ESTA_ENCENDIDO = "el telefono esta encendido";
	final static String NO_APAGAR = "No se puede encender";
	final static String ESTA_APAGADO = "el telefono esta apagado";
	final static String LLAMANDO = 	"Llamando al numero" ;
	final static String NO_LLAMANDO = "No se puede llamar";

	private String marca;
	private boolean encendido;

	public TelefonoMovil() {
		this.marca = "";
		this.encendido = false;
	}
	
	public TelefonoMovil(String m, boolean e) {
		this.marca = m;
		this.encendido = e;
	}	
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setEncendido(boolean enc) {
		this.encendido = enc;
	}	
	
	public String getMarca() {
		return this.marca;
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

	public void llamar(String numero) {
		if (this.encendido)
			System.out.println(LLAMANDO + " " + numero);
		else
			System.out.println(NO_LLAMANDO + " " + ESTA_APAGADO);			
		}
	
}
