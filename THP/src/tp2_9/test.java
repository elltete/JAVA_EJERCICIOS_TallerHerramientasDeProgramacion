package tp2_9;

public class test {

	public static void main(String[] args) {

		Calculadora prueba = new Calculadora();
		
		System.out.println(prueba.sumar(2,5));
		
		System.out.println(prueba.restar(8, 5));
		
		System.out.println(prueba.multiplicar(4, 4));
		
		System.out.println(prueba.dividir(4, 2));
		
		System.out.println(prueba.dividir(4, 0));
		
	}

}
