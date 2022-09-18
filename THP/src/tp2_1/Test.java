package tp2_1;

public class Test {

	public static void main(String[] args) {

		Fecha f1 = new Fecha();
		Fecha f2 = new Fecha(21, 04, 2021);

		System.out.println("Mostrar fecha: " + f1.mostrarComoCadena());
		System.out.println("Mostrar fecha: " + f2.mostrarComoCadena());

		f1.mostrarDiasTranscurridos();		
		f2.mostrarDiasTranscurridos();		
		
		//////////////////////////////////////
		
		TelefonoMovil tel1 = new TelefonoMovil();
		tel1.setMarca("Iphone");
		tel1.setEncendido(true);

		TelefonoMovil tel2 = new TelefonoMovil("Samsung", false);
		
		tel1.prender();
		tel2.apagar();
		
		tel1.llamar("656565656556");
		tel2.llamar("232232323232");
		
		tel1.apagar();
		tel2.prender();
		
		tel1.llamar("656565656556");
		tel2.llamar("232232323232");
		
		//////////////////////////////////////

		MaquinaDeCafe m1 = new MaquinaDeCafe();
		MaquinaDeCafe m2 = new MaquinaDeCafe(5,5,true);
		
		m1.prender();
		m2.apagar();
		m1.prepararInfusion();
		m2.prepararInfusion();
		
	}

}