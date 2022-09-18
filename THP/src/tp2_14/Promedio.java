package tp2_14;

public class Promedio {

	private Contador contador = new Contador();
	private Acumulador acumulador = new Acumulador();
	
	public void incrementar(double num) {
		contador.incrementar();
		acumulador.incrementar(num);
	}
	
	public double obtenerValor() {
		double resultado = 0;
		if(contador.obtenerValor() != 0) {
			resultado = acumulador.obtenerValor()/contador.obtenerValor();
		}
		return resultado;
	}
}
