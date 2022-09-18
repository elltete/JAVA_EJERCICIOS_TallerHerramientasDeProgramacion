package tp2_9;

public class Calculadora {

	public int sumar(int a, int b) {
		return a+b;
	}
	
	public int restar(int a, int b) {
		return a-b;
	}
	
	public int multiplicar(int a, int b) {
		return a*b;
	}
	
	public int dividir(int a, int b) {
		int resultado = 0;
		if(b!=0) {
			resultado = a/b;
		}
		return resultado;
	}
	
}
