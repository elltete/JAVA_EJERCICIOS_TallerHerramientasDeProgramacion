package tp2_14;

public class Acumulador {
	
	static private double valor = 0;
	
	public void incrementar(double num) {
		valor+=num;
	}
	
	public double obtenerValor() {
		return valor;
	}
	

}
