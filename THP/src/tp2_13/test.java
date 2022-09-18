package tp2_13;

public class test {

	public static void main(String[] args) {

		//LLAMADO A METODOS CONSTRUCTORES

		Persona pers1 = new Persona("NN","NN","0");
		Persona pers2 = new Persona("Diego", "Ponzo", "24030275");

		Procesador proc1 = new Procesador("Apple", "M1", 96, 94);
		Procesador proc2 = new Procesador("AMD", "P4", 96, 95);
		
		DVD dvd1 = new DVD("SAMSUNG", false);
		DVD dvd2 = new DVD("LG", true);
		DVD dvd3 = new DVD("SIN DVD", false);
		
		Computadora compu1 = new Computadora("MacBook", TipoComputadora.LAPTOP, proc1, dvd3);
		Computadora compu2 = new Computadora("LENOVO", TipoComputadora.ALL_IN_ONE, proc2, dvd1);
		Computadora compu3 = new Computadora("DELL", TipoComputadora.DESKTOP, proc2, dvd2);
		
		
		//ASIGNACION DE COMPUTADORAS
		pers1.setComputadora(compu2);
		pers2.setComputadora(compu1);
		
		pers1.descansar();
		pers2.trabajar();
		
		//GRABAR
		System.out.println(pers1.grabar(dvd2));
		System.out.println(pers2.grabar(dvd1));

		
		//SALIDA
		
		System.out.println(pers1.mostrarComputadora());
		System.out.println(pers2.mostrarComputadora());
		
//		System.out.println(pers1.toString());
//		System.out.println(pers2.toString());
		
		
		

		//El DVD que tiene la compu de la persona 2, es grabable?

		if (dvd2.getGrabacion()) {
			System.out.println("GRABA");
		}else {
			System.out.println("NO GRABA");
		}

		//El micro que tiene la compu de la persona 1, tiene la temperatura Critica?
		
		if (pers2.getComputadora().getProcesador().informarCriticidad2()) {
			System.out.println("Temperatura Critica");
		}else {
			System.out.println("Temperatura Estable");
		}
		
		
		
	}

}
