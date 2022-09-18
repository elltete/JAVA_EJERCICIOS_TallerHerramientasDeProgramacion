package tp2_2;

public class Procesador {
	
	final static String WARNING = "El nivel de temperatura es CRITICA";
	final static String ESTABLE = "El nivel de temperatura es ESTABLE";
	
	private String marca;
	private String modelo;
	private int temperaturaActual;
	private int nivelMaxTempCritica;
	
	public Procesador() {
		this.marca = "";
		this.modelo = "";
		this.temperaturaActual = 0;
		this.nivelMaxTempCritica = 95;
	}
	
	public Procesador(String marca, String valor, int tempActual, int tempMax) {
		this.marca = marca;
		this.modelo = valor;
		this.temperaturaActual = tempActual;
		this.nivelMaxTempCritica = tempMax;
	}	

	public boolean informarCriticidad() {
		boolean resultado = temperaturaActual>=nivelMaxTempCritica;
		if (resultado) {
			System.out.println(WARNING);
		}else {
			System.out.println(ESTABLE);			
		}
		return resultado;
	}
	
	public boolean informarCriticidad2() {
		return temperaturaActual>=nivelMaxTempCritica;
	}
	
	@Override
	public String toString(){
		return "[marca=" + this.marca + ", modelo=" + this.modelo + ", temperatura actual=" + this.temperaturaActual + ", maxima temperatura=" + this.nivelMaxTempCritica +"]";
	}
	
}
