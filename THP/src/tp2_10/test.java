package tp2_10;

public class test {

	public static void main(String[] args) {

		Fraccion f1 = new Fraccion(4,7);
		Fraccion f2 = new Fraccion(2,8);
		Fraccion f3 = new Fraccion(0,0);
		
		CalculadoraDeFraccion op = new CalculadoraDeFraccion();

		System.out.println(op.valorReal(f1));
		System.out.println(op.valorReal(f2));
		System.out.println(op.sumar(f1,3).toString());
		System.out.println(op.sumar(f1,f2).toString());		
	}

}
