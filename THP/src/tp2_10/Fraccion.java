package tp2_10;

public class Fraccion {

	private int numerador;
	private int denominador;

	public Fraccion(int num, int den) {
		if (den == 0) {
			System.out.println("El denominador no puede ser 0");
		} else {
			this.numerador = num;
			this.denominador = den;
		}
	}

	public int getNumerador() {
		return numerador;
	}
	
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	
	public int getDenominador() {
		return denominador;
	}
	
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	@Override
	public String toString() {
		return "Fraccion [numerador=" + numerador + ", denominador=" + denominador + "]";
	}

}
