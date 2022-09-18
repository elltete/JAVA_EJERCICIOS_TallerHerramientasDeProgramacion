package tp2_8;

public class test {

	public static void main(String[] args) {

		Turnera t1 = new Turnera();
		Turnera t2 = new Turnera();
		Turnera t3 = new Turnera();
		Turnera t4 = new Turnera();
		Turnera t5 = new Turnera();
		Turnera t6 = new Turnera();
		
		System.out.println(t1.toString());
		t2.otorgarProximoNumero();
		System.out.println(t2.toString());
		t3.otorgarProximoNumero();		
		System.out.println(t3.toString());
		System.out.println(t4.verUltimoNumeroOtorgado());
		t4.otorgarProximoNumero();
		System.out.println(t4.toString());
		t5.resetearContador();
		System.out.println(t5.toString());
		t6.resetearContador(-6);
		System.out.println(t6.toString());

	}

}
