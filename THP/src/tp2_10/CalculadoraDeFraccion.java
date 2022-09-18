package tp2_10;

public class CalculadoraDeFraccion {

	public double valorReal(Fraccion f) {
		double valor = (double) f.getNumerador()/f.getDenominador();
		return valor;
	}
	
	public Fraccion sumar(Fraccion f, int num){
		int b = f.getDenominador();
		int a = f.getNumerador() + b*num;
		Fraccion ff = new Fraccion(a,b);
		return ff;
	} 

	public Fraccion sumar(Fraccion f1, Fraccion f2){
		int a = f1.getNumerador()*f2.getDenominador() + f2.getNumerador()*f1.getDenominador();
		int b = f1.getDenominador()*f2.getDenominador();
		Fraccion ff = new Fraccion(a,b);
		return ff;		
	} 
}
